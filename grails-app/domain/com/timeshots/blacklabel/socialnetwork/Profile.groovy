package com.timeshots.blacklabel.socialnetwork

import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode
class Profile {

    Contact contact
    Address address
    User user
    EducationalAttainment educationalAttainment
    Work work

    String interestedIn     // women or men
    String religion
    String civilStatus
    String nationality
    String id

    static constraints = {
        educationalAttainment(nullable: true)
        interestedIn(nullable: true)
        religion(nullable: true, size: 3..35)
        civilStatus(nullable: true)
        nationality(nullbale: true)
        work(nullable: true)
    }

    static mapping = {
        table 'profile'
        id generator:'uuid'
    }
}