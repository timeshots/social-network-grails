package com.timeshots.blacklabel.socialnetwork

class Contact {
    String emailAddress
    String phoneNumber
    String cellphoneNumber
    String id

    static belongsTo = Profile

    static constraints = {
        emailAddress(nullable: false)
        phoneNumber(nullable: true)
        cellphoneNumber(nullable: true)
    }

    static mapping = {
        table 'contact'
        id generator:'uuid'
    }
}