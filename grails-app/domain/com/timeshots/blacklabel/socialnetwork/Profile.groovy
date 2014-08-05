package com.timeshots.blacklabel.socialnetwork

import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode
class Profile {

    Date birthDate
    String gender
    String interestedIn     // women or men
    String religion
    String civilStatus
    String nationality
    String id

    //static hasMany = [user:User, address:Address, contact:Contact]
    Contact contact
    Address address
    User user

    static constraints = {
        birthDate(nullable: true)
        gender(nullable: false, size: 4..6)
        interestedIn(nullable: true)
        religion(nullable: true, size: 3..35)
        civilStatus(nullable: true)
        nationality(nullbale: true)

        contact(nullable: false)
        address(nullable: false)
        user(nullable: false)
    }

    static mapping = {
        table 'profile'
        id generator:'uuid'
    }
}