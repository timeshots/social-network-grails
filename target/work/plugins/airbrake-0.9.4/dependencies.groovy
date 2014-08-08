grails.project.work.dir = "target"

grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // uncomment to disable ehcache
        // excludes 'ehcache'
    }
    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    repositories {
        grailsCentral()
    }

    plugins {
        build(":release:2.2.1", ":rest-client-builder:1.0.2", ":tomcat:$grailsVersion") {
            export = false
        }
        test(':spock:0.7') {
            export = false
        }
    }
}
