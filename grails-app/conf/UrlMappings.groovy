class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {}
        }

        /** user signup */
        "/api/v1/signup" (controller: "userRegistration"){
            action = [POST:"register"]
        }

        /** User Login */
        "/api/v1/auth/login" (controller: "login"){
            action = [POST:"authenticate"]
        }

        "/"(redirect: '/app/')

        /*"/confirm?" {
            controller = 'emailConfirmation'
            action = "index"
        }*/

        /*"/"(view:"/home/home")*/
        "500"(view:'/error')
	}
}