package com.timeshots.blacklabel.socialnetwork

class Profile {

    Date birthDate
    String gender
    String interestedIn     // women or men
    List<String> languages
    String religion
    String civilStatus
    String nationality
    String id

    User user
    Address address
    Contact contact

    static constraints = {
        birthDate(nullable: true)
        gender(nullable: false, size: 4..6)
        interestedIn(nullable: true)
        languages(nullable: true)
        religion(nullable: true, size: 3..35)
        civilStatus(nullable: true)
        nationality(nullbale: true)

        user(nullable: false)
        address(nullable: false)
        contact(nullable: false)
    }

    static mapping = {
        table 'profile'
        id generator:'uuid'
    }
}