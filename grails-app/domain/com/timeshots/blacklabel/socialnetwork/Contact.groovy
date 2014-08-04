package com.timeshots.blacklabel.socialnetwork

class Contact {
    String emailAddress
    String phoneNumber
    String cellphoneNumber

    static belongsTo = Profile

    static constraints = {
        emailAddress(nullable: false)
        phoneNumber(nullable: true)
        cellphoneNumber(nullable: true)
    }
}