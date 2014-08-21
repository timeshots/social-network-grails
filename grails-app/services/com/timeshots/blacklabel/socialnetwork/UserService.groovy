package com.timeshots.blacklabel.socialnetwork

import grails.transaction.Transactional

@Transactional
class UserService {

    public void createUser(User user){
        user.save(flush: true, failOnError: true)
    }
}
