package com.timeshots.blacklabel.socialnetwork



class UserRegistrationController {

    def signup(){
        String firstName = params?.firstName
        String lastName = params?.lastName
        String username = params?.username
        String email = params?.emailAddress
        String password = params?.password
        String confirmPassword = params?.confirmPassword
    }

    def index() { }
}