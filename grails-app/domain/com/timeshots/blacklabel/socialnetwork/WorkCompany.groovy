package com.timeshots.blacklabel.socialnetwork

class WorkCompany {

    String companyName
    String companyAddress
    String companyType

    static constraints = {
        companyName(nullable: false)
        companyAddress(nullable: false)
        companyType(nullable: true)
    }
}
