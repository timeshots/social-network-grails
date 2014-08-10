package com.timeshots.blacklabel.socialnetwork.security

import com.timeshots.blacklabel.socialnetwork.User
import org.springframework.security.authentication.encoding.PasswordEncoder

class LoginController {

    PasswordEncoder passwordEncoder
    User user

    def authenticate(){

        String message
        String username = params?.username
        String password = params?.password

        if(!username || !password){
            message = "Missing username or password"
        }

        if(message){
            flash.message = message
            redirect(action: 'auth')
            return
        }

        if(username.contains('@')){
            user = User.findByEmailAddress(username)
        }else{
            user = User.findByUsername(username)
        }

        if(!user){
            flash.message = "Unregistered user"
            redirect(action: 'auth')
            return
        }

        if(passwordEncoder.isPasswordValid(user.password, password, null)){
            session.user = user
        }else{
            message = "Login Failed"
        }

        if(!message){
            flash.message = "Login succeed"
            redirect(controller: "user", action: 'dashboard')
            return
        }else{
            flash.message = message
            redirect(action: 'auth')
            return
        }
    }

    def auth(){}
}