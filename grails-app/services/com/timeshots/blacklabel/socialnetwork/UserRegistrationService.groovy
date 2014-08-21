package com.timeshots.blacklabel.socialnetwork

import grails.transaction.Transactional

@Transactional
class UserRegistrationService {

    UserService userService

    public Boolean certifyAndCreateUser(User user){
        if(!user.isCompletelyRegistered()){
            return false
        }

        userService.createUser(user)
        return true
    }
}
