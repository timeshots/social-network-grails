package com.timeshots.blacklabel.socialnetwork

import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode
class Contact {

    User user
    String emailAddress
    String phoneNumber
    String cellphoneNumber
    String id

    static constraints = {
        user(nullable: false)
        emailAddress(nullable: false)
        phoneNumber(nullable: true)
        cellphoneNumber(nullable: true)
    }

    static mapping = {
        table 'contact'
        id generator:'uuid'
    }
}