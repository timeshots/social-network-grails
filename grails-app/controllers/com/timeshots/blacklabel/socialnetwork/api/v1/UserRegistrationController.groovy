package com.timeshots.blacklabel.socialnetwork.api.v1

import com.timeshots.blacklabel.socialnetwork.UserRegistrationService
import com.timeshots.blacklabel.socialnetwork.security.Role
import com.timeshots.blacklabel.socialnetwork.User

class UserRegistrationController {

    static responseFormats = ['json']
    static allowedMethods = [checkUsernameDuplicate:"POST", checkEmailDuplicate: "POST", save: "POST"]

    UserRegistrationService userRegistrationService

    def signup(){
    }

    def register(){
        String firstName = params?.firstName
        String lastName = params?.lastName
        String username = params?.username
        String emailAddress = params?.emailAddress
        String password = params?.password
        String confirmPassword = params?.confirmPassword
        Integer birthMonth = params.int('birthday_month')
        Integer birthDayDate = params.int('birthday_date')
        Integer birthYear = params.int('birthday_year')
        Integer gender = params.int('sex')

        if(!password.equals(confirmPassword)){
            flash.message = "password is not equal to confirm password"
            redirect(controller: 'userRegistration', action: 'signup')
            return
        }
        Role role = Role.findByAuthority('ROLE_USER')
        User user = new User(firstName:firstName, lastName:lastName, emailAddress:emailAddress, username:username, password:password, birthDate:new Date(birthYear, (birthMonth-1), birthDayDate), gender: gender, role:role)

        if(!userRegistrationService.certifyAndCreateUser(user)){
            flash.message = "Fail to register."
            redirect(controller: 'userRegistration', action: 'signup')
            return
        }

        redirect(controller: 'login', action: 'auth')
        return
    }
}