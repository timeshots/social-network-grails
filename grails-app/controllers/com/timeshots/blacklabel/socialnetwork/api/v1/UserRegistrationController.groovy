package com.timeshots.blacklabel.socialnetwork.api.v1

import com.timeshots.blacklabel.socialnetwork.UserRegistrationService
import com.timeshots.blacklabel.socialnetwork.security.Role
import com.timeshots.blacklabel.socialnetwork.User
import org.apache.commons.validator.EmailValidator
import org.springframework.http.HttpStatus

class UserRegistrationController {

    static responseFormats = ['json']
    static allowedMethods = [checkUsernameDuplicate:"POST", checkEmailDuplicate: "POST", save: "POST"]

    UserRegistrationService userRegistrationService

    def checkUsernameDuplicate(){
        String username = request?.JSON?.username?.trim()

        if(!username){
            response.status = HttpStatus.BAD_REQUEST.value
            respond([message: "Empty username."])
            return
        }

        if(!username.matches(User.constraints["username"]["matches"])){
            response.status = HttpStatus.BAD_REQUEST.value
            respond([message: "Invalid username, try another username."])
            return
        }

        response.status = HttpStatus.OK.value
        respond([message: "Valid username."])
    }

    def checkEmailDuplicate(){
        EmailValidator emailValidator = new EmailValidator()
        String emailAddress = request?.JSON?.emailAddress?.trim()

        if(!emailAddress)   {
            response.status = HttpStatus.BAD_REQUEST.value
            respond([message: "Empty email address."])
            return
        }

        if(!emailValidator.isValid(emailAddress))    {
            response.status = HttpStatus.BAD_REQUEST.value
            respond([message: "Not valid email  address."])
            return
        }

        response.status = HttpStatus.OK.value
        respond([message: "Valid email address."])
    }

    def register(){
        String firstName = request?.JSON?.firstName?.trim()
        String lastName = request?.JSON?.lastName?.trim()
        String username = request?.JSON?.username?.trim()
        String emailAddress = request?.JSON?.emailAddress?.trim()
        String password = request?.JSON?.password?.trim()
        String confirmPassword = request?.JSON?.confirmPassword?.trim()
        Integer birthMonth = request?.JSON?.birthMonth
        Integer birthDayDate = request?.JSON?.birthDayDate
        Integer birthYear = request?.JSON?.birthYear
        Integer gender = (request?.JSON?.gender == 'Female') ? 2 : (request?.JSON?.gender == 'Male') ? 1 : request?.JSON?.gender

        if(!password.equals(confirmPassword)){
            response.status = HttpStatus.BAD_REQUEST.value
            respond([message: "Password is not equal to confirm password."])
            return
        }
        Role role = Role.findByAuthority('ROLE_USER')
        User user = new User(firstName:firstName, lastName:lastName,
                             emailAddress:emailAddress, username:username,
                             password:password, birthDate:new Date(birthYear, (birthMonth-1), birthDayDate),
                             gender: gender, role:role)

        if(!userRegistrationService.certifyAndCreateUser(user)){
            response.status = HttpStatus.BAD_REQUEST.value
            respond([message: "Fail to register."])
            return
        }
        response.status = HttpStatus.OK.value
        respond([message: "Successfully registered."])
        return
    }
}