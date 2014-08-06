import com.timeshots.blacklabel.socialnetwork.bootstrap.initializer.DevelopmentDataInitializer
import com.timeshots.blacklabel.socialnetwork.bootstrap.initializer.StagingDataInitializer
import com.timeshots.blacklabel.socialnetwork.bootstrap.BootstrapInitializer

// Place your Spring DSL code here
beans = {

    developmentDataInitializer(DevelopmentDataInitializer)

    stagingDataInitializer(StagingDataInitializer)

    developmentBootstrapInitializer(BootstrapInitializer){
        initializers = ref('developmentDataInitializer')
    }

    stagingBootstrapInitializer(BootstrapInitializer){
        initializers = ref('stagingDataInitializer')
    }
}