package com.timeshots.blacklabel.socialnetwork

class Address {
    String streetAddress
    String city
    String state
    String zipCode

    static belongsTo = Profile

    static constraints = {
        streetAddress(nullable: false)
        city(nullable: false)
        state(nullable: false)
        zipCode(nullable: false)
    }
}