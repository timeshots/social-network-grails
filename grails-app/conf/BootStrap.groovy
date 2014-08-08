import com.timeshots.blacklabel.socialnetwork.bootstrap.BootstrapInitializer

class BootStrap {

    BootstrapInitializer developmentBootstrapInitializer
    BootstrapInitializer stagingBootstrapInitializer

    def init = { servletContext ->
        environments {
            development{
                developmentBootstrapInitializer.execute()
            }
            test{
                developmentBootstrapInitializer.execute()
            }
            staging{
                stagingBootstrapInitializer.execute()
            }
            production{
                stagingBootstrapInitializer.execute()
            }
        }
    }

    def destroy = {
    }
}