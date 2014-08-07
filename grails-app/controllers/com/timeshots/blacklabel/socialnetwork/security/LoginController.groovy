package com.timeshots.blacklabel.socialnetwork.security

import com.timeshots.blacklabel.socialnetwork.User
import org.springframework.security.authentication.encoding.PasswordEncoder

class LoginController {

    PasswordEncoder passwordEncoder
    User user

    def authenticate(){

        String username = params?.username
        String password = params?.password

        if(!username){
            flash.message = "Missing username"
            redirect(action: 'auth')
        }

        if(!password){
            flash.message = "Missing password"
            redirect(action: 'auth')
        }

        user = User.findByUsername(username)
        if(!user){
            flash.message = "Unregistered user"
            redirect(action: 'auth')
        }

        if(passwordEncoder.isPasswordValid(user.password, password, null)){
            flash.message = "Login Succeed"
            session.user = "User"
            redirect(action: 'dashboard')
        }else{
            flash.message = "Login Failed"
            redirect(action: 'auth')
        }
    }

    def logout(){
        session.user = null
        redirect(action: 'auth')
    }

    def dashboard(){

    }

    def auth(){

    }

    def index() { }
}