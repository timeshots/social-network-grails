import com.timeshots.blacklabel.socialnetwork.bootstrap.initializer.DevelopmentDataInitializer
import com.timeshots.blacklabel.socialnetwork.bootstrap.initializer.StagingDataInitializer
import com.timeshots.blacklabel.socialnetwork.bootstrap.BootstrapInitializer
import grails.plugin.springsecurity.SpringSecurityUtils

// Place your Spring DSL code here
beans = {

    def conf = SpringSecurityUtils.securityConfig

    developmentDataInitializer(DevelopmentDataInitializer)

    stagingDataInitializer(StagingDataInitializer)

    developmentBootstrapInitializer(BootstrapInitializer){
        initializers = ref('developmentDataInitializer')
    }

    stagingBootstrapInitializer(BootstrapInitializer){
        initializers = ref('stagingDataInitializer')
    }
}