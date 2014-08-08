package com.timeshots.blacklabel.socialnetwork

import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode
class Profile {

    Contact contact
    Address address
    User user

    Date birthDate
    String gender
    String interestedIn     // women or men
    String religion
    String civilStatus
    String nationality
    String id

    static constraints = {
        birthDate(nullable: true)
        gender(nullable: false, size: 4..6)
        interestedIn(nullable: true)
        religion(nullable: true, size: 3..35)
        civilStatus(nullable: true)
        nationality(nullbale: true)

    }

    static mapping = {
        table 'profile'
        id generator:'uuid'
    }
}