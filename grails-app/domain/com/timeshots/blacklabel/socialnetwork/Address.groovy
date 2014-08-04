package com.timeshots.blacklabel.socialnetwork

class Address {
    String streetAddress
    String city
    String state
    String zipCode
    String id

    static belongsTo = Profile

    static constraints = {
        streetAddress(nullable: false)
        city(nullable: false)
        state(nullable: false)
        zipCode(nullable: false)
    }

    static mapping = {
        table 'address'
        id generator:'uuid'
    }
}