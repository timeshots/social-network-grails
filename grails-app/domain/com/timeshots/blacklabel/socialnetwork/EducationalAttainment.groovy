package com.timeshots.blacklabel.socialnetwork

class EducationalAttainment {

    User user
    School tertiaryEducation
    School secondaryEducation
    School primaryEducation
    String id

    static constraints = {
        user(nullable: false)
        tertiaryEducation(nullable: true)
        secondaryEducation(nullable: true)
        primaryEducation(nullable: true)
    }

    static mapping = {
        table 'educationalattainment'
        id generator:'uuid'
    }
}