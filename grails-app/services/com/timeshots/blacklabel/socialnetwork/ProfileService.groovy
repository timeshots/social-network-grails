package com.timeshots.blacklabel.socialnetwork

import grails.transaction.Transactional

@Transactional
class ProfileService {

    public User fetchUserByEmailAddress(String emailAddress){
        if(!emailAddress || emailAddress == ""){
            return null
        }
        return User.findByEmailAddress(emailAddress)
    }

    public Living fetchLivingByUser(User user){
        if(!user){
            return null
        }
        return Living.findByUser(user)
    }

    public Work fetchWorkByUser(User user){
        if(!user){
            return null
        }
        return Work.findByUser(user)
    }
}