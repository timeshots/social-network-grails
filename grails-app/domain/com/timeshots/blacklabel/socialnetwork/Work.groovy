package com.timeshots.blacklabel.socialnetwork

class Work {

    WorkPosition workPosition
    WorkCompany workCompany

    static constraints = {
        workPosition(nullable: true)
        workCompany(nullable: true)
    }
}
