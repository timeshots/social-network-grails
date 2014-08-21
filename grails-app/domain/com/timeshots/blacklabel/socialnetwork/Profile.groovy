package com.timeshots.blacklabel.socialnetwork

import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode
class Profile {

    Contact contact
    Living living
    User user
    EducationalAttainment educationalAttainment
    Work work

    String interestedIn     // women or men
    String religion
    String civilStatus
    String nationality
    String id

    static constraints = {
        contact(nullable: true)
        living(nullable: true)
        user(nullable: true)
        educationalAttainment(nullable: true)
        work(nullable: true)

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