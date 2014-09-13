grails.servlet.version = "3.0" // Change depending on target container compliance (2.5 or 3.0)
grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
grails.project.work.dir = "target/work"
grails.project.target.level = 1.6
grails.project.source.level = 1.6
//grails.project.war.file = "target/${appName}-${appVersion}.war"

grails.project.fork = [
    // configure settings for compilation JVM, note that if you alter the Groovy version forked compilation is required
    //  compile: [maxMemory: 256, minMemory: 64, debug: false, maxPerm: 256, daemon:true],

    // configure settings for the test-app JVM, uses the daemon by default
    test: [maxMemory: 768, minMemory: 64, debug: false, maxPerm: 256, daemon:true],
    // configure settings for the run-app JVM
    run: [maxMemory: 768, minMemory: 64, debug: false, maxPerm: 256, forkReserve:false],
    // configure settings for the run-war JVM
    war: [maxMemory: 768, minMemory: 64, debug: false, maxPerm: 256, forkReserve:false],
    // configure settings for the Console UI JVM
    console: [maxMemory: 768, minMemory: 64, debug: false, maxPerm: 256]
]

grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // specify dependency exclusions here; for example, uncomment this to disable ehcache:
        // excludes 'ehcache'
    }
    log "error" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    checksums true // Whether to verify checksums on resolve
    legacyResolve false // whether to do a secondary resolve on plugin installation, not advised and here for backwards compatibility

    //def gebVersion = '0.9.2'
    //def seleniumVersion = '2.41.0'

    repositories {
        inherits true // Whether to inherit repository definitions from plugins

        grailsPlugins()
        grailsHome()
        mavenLocal()
        grailsCentral()
        mavenCentral()
        mavenRepo 'http://repo.spring.io/milestone'
        // uncomment these (or add new ones) to enable remote dependency resolution from public Maven repositories
        /*mavenRepo "http://repository.codehaus.org"
        mavenRepo "http://download.java.net/maven/2/"
        mavenRepo "http://repository.jboss.com/maven2/"*/
    }

    dependencies {
        compile 'com.amazonaws:aws-java-sdk:1.7.5'
        build 'org.apache.httpcomponents:httpcore:4.2'
        build 'org.apache.httpcomponents:httpclient:4.2'
        runtime 'org.apache.httpcomponents:httpcore:4.2'
        runtime 'org.apache.httpcomponents:httpclient:4.2'
        //test "org.seleniumhq.selenium:selenium-chrome-driver:$seleniumVersion"
        //test('org.seleniumhq.selenium:selenium-firefox-driver:$seleniumVersion')
        //test "org.gebish:geb-spock:$gebVersion"
        // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes e.g.
        runtime 'mysql:mysql-connector-java:5.1.29'
        // runtime 'org.postgresql:postgresql:9.3-1101-jdbc41'
        //test "org.grails:grails-datastore-test-support:1.0-grails-2.4"
        compile "org.jadira.usertype:usertype.jodatime:2.0.1"
        //compile 'com.google.guava:guava:17.0'
        //test('com.github.detro.ghostdriver:phantomjsdriver:1.0.4') { transitive = false }
    }

    plugins {
        // plugins for the build system only
        build ":tomcat:7.0.54"
        //compile ':aws-sdk:1.7.7'

        // plugins for the compile step
        compile ":scaffolding:2.1.2"
        compile ':cache:1.1.7'
        compile ":asset-pipeline:1.8.11"

        compile ":mail:1.0.6"

        // plugins needed at runtime but not for compilation
        runtime ':hibernate:3.6.10.16' //runtime ":hibernate4:4.3.5.4" // or ":hibernate:3.6.10.16"
        runtime ":database-migration:1.4.0"
        runtime ":jquery:1.11.1"

        compile ":spring-security-core:2.0-RC3"
        compile ":spring-security-rest:1.4.0.RC3", {
            excludes: 'spring-security-core'
        }

        // Uncomment these to enable additional asset-pipeline capabilities
        //compile ":sass-asset-pipeline:1.7.4"
        compile ":less-asset-pipeline:1.7.0"
        //compile ":coffee-asset-pipeline:1.7.0"
        //compile ":handlebars-asset-pipeline:1.3.0.3"
        runtime ':twitter-bootstrap:3.1.1.3'

        //compile ':multi-tenant-single-db:0.8.3'

        //test data builder plugin
        compile ':build-test-data:2.1.2'

        //functional testing plugin
        //test ":geb:$gebVersion"
        //test ':code-coverage:1.2.7'
        test ":code-coverage:2.0.3-1"
        // Not required, but very useful in speeding up working with functional tests
        //to use, run: 'grails develop-functional-tests'
        compile ':functional-test-development:0.9.3'
        //compile ':funky-test-load:0.3.9'
        compile ':quartz:1.0.1'
        compile ":platform-core:1.0.0"
        compile ":airbrake:0.9.4"

        compile ":fatcow-icons:0.1.0"
    }
}
grails.project.dependency.resolver = "maven" // or ivy
