package com.timeshots.blacklabel.socialnetwork

class School {

    String schoolName
    String schoolAddress
    String id

    static constraints = {
        schoolName(nullable: false)
        schoolAddress(nullable: false)
    }

    static mapping = {
        table 'school'
        id generator:'uuid'
    }
}