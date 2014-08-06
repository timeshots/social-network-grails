package grails.plugins.airbrake

import groovy.transform.ToString
import groovy.util.logging.Log4j

import java.util.regex.Pattern

@ToString(includeNames=true)
@Log4j
class AirbrakeNotifier {
    def grailsApplication

    static final String AIRBRAKE_API_VERSION = '2.2'
	static final String AIRBRAKE_HOST = 'airbrakeapp.com'
	static final String AIRBRAKE_PATH = '/notifier_api/v2/notices'

	static final String NOTIFIER_NAME = 'grails-airbrake'
	static final String NOTIFIER_VERSION = '0.9.4'
	static final String NOTIFIER_URL = 'https://github.com/cavneb/airbrake-grails'

    final Configuration configuration

    // mostly to make mocking easier in specs
    protected AirbrakeNotifier() {}

    AirbrakeNotifier(Configuration configuration) {
        this.configuration = configuration
    }

    void notify(Throwable throwable, Map options = [:]) {
        // Notifying Airbrake can never throw
        try {
            if (configuration.enabled && !isExcluded(throwable)) {
                options.throwable = throwable
                sendNotice(buildNotice(options))
            }
        } catch (Throwable t) {
            // Log the error to System.err so we don't go through log4j and spiral to our doom
            System.err.println("Error notifying Airbrake about error ${options.errorMessage}. Error was ${t.message}.")
        }
    }

    Notice buildNotice(Map options) {
        new Notice(configuration.merge(options))
    }

	void sendNotice(Notice notice) {
        if (configuration.async) {
            configuration.async(notice, grailsApplication)
        } else {
            sendToAirbrake(notice)
        }
	}

    /**
     * Indicates whether <tt>throwable</tt> can be sent to Airbrake. It will not be eligible for sending if
     * one of the configured exclusions patterns matches it.
     * @param throwable
     * @return
     */
    private boolean isExcluded(Throwable throwable) {

        if (!throwable) {
            return false
        }

        String throwableClassname = throwable.class.name

        Pattern excludingPattern = configuration.excludes.find {Pattern excludePattern ->
            throwableClassname ==~ excludePattern
        }

        if (excludingPattern) {
            log.debug "Sending errors of type type $throwableClassname is prevented by the excludes pattern '${excludingPattern.pattern()}'"
        }
        excludingPattern
    }

    boolean sendToAirbrake(Notice notice) {

        if (!configuration.enabled) {
            return false
        }

        if (!notice.apiKey) {
            throw new RuntimeException("The API key for the project this error is from is required. Get this from the project's page in airbrake.")
        }

        log.debug "Sending Notice ${notice} to airbrake"

        HttpURLConnection conn

        try {
            conn = buildConnection()

            if (log.debugEnabled) {
                log.debug "Sending notice data to ${conn.getURL()}"

                def stringWriter = new StringWriter()
                notice.toXml(stringWriter)
                log.debug "$stringWriter"
            }

            conn.outputStream.withWriter { outputWriter ->
                notice.toXml(outputWriter)
            }

            int responseCode = conn.responseCode
            String responseMessage = conn.responseMessage
            log.debug "Received HTTP response $responseCode"

            if (responseCode in 200..<300) {
                return true

            } else {
                System.err.println("HTTP Response ${responseCode}: ${responseMessage}. Failed to send: ${notice}")
            }
        } catch (e) {
            System.err.println "Error sending Notice ${notice} to Airbrake. Exception: ${e}"
        } finally {
            conn?.disconnect()
        }
        return false
    }

    private HttpURLConnection buildConnection() {
        URL apiURL = new URL(configuration.scheme, configuration.host, configuration.port, configuration.path)

        HttpURLConnection conn = apiURL.openConnection()
        conn.setDoOutput(true)
        conn.setRequestProperty("Content-type", "text/xml")
        conn.setRequestProperty("Accept", "text/xml, application/xml")
        conn.setRequestMethod("POST")
        conn
    }
}
