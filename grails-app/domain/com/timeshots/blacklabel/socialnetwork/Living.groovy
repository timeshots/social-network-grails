package com.timeshots.blacklabel.socialnetwork

class Living {

    User user
    Address currentAddress
    Address hometownAddress

    static constraints = {
        user(nullable: false)
        currentAddress(nullable: true)
        hometownAddress(nullable: true)
    }
}