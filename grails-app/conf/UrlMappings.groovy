class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(redirect: '/app/')

        "/confirm?" {
            controller = 'emailConfirmation'
            action = "index"
        }

        "/"(view:"/home/home")
        "500"(view:'/error')
	}
}