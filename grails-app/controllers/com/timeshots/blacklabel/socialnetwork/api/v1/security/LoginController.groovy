package com.timeshots.blacklabel.socialnetwork.api.v1.security

import com.timeshots.blacklabel.socialnetwork.User
import org.springframework.security.authentication.encoding.PasswordEncoder
import org.springframework.http.HttpStatus

class LoginController {

    static responseFormats = ['json']
    static allowedMethods = [authenticate: "POST"]

    PasswordEncoder passwordEncoder
    User user

    def authenticate(){
        String username = request?.JSON?.username?.trim()
        String password = request?.JSON?.password?.trim()
        String message

        if(!username || !password){
            message = "Missing username or password"
        }

        if(message){
            response.status = HttpStatus.UNAUTHORIZED.value()
            respond ([message: message])
            return
        }

        if(username.contains('@')){
            user = User.findByEmailAddress(username)
        }else{
            user = User.findByUsername(username)
        }

        if(!user){
            response.status = HttpStatus.UNAUTHORIZED.value()
            respond ([message: "Unregistered user."])
            return
        }

        if(passwordEncoder.isPasswordValid(user.password, password, null)){
            session.user = user
        }else{
            message = "Login Failed"
        }

        if(!message){
            response.status = HttpStatus.OK.value()
            respond ([message: "Successfully login."])
            return
        }else{
            response.status = HttpStatus.UNAUTHORIZED.value()
            respond ([message: message])
            return
        }
    }
}