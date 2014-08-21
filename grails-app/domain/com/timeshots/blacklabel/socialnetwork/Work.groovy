package com.timeshots.blacklabel.socialnetwork

class Work {

    User user
    WorkPosition workPosition
    WorkCompany workCompany

    static constraints = {
        user(nullable: false)
        workPosition(nullable: true)
        workCompany(nullable: true)
    }
}