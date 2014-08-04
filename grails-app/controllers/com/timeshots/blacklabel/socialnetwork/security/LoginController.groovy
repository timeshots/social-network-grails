package com.timeshots.blacklabel.socialnetwork.security

import com.timeshots.blacklabel.socialnetwork.User

class LoginController {

    User user

    def authenticate(){

        user = User.findByUsernameAndPassword(params?.username, params?.password)

        if(user){
            flash.message = "Login Succeed"
            session.user = "User"
        }else{
            flash.message = "Login Failed"
        }

        redirect(action: 'auth')
    }

    def logout(){
        session.user = null
        redirect(action: 'auth')
    }

    def auth(){

    }

    def index() { }
}