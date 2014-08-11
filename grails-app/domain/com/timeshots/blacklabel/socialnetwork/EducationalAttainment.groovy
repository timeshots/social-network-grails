package com.timeshots.blacklabel.socialnetwork

class EducationalAttainment {

    School tertiaryEducation
    School secondaryEducation
    School primaryEducation
    String id

    static constraints = {
        tertiaryEducation(nullable: true)
        secondaryEducation(nullable: true)
        primaryEducation(nullable: true)
    }

    static mapping = {
        table 'educationalattainment'
        id generator:'uuid'
    }
}