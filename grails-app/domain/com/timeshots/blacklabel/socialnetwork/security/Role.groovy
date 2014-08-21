package com.timeshots.blacklabel.socialnetwork.security

import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode
class Role {

    String authority

    static constraints = {
        authority(blank: false, unique: true)
    }
}
