package com.timeshots.blacklabel.socialnetwork

import com.timeshots.blacklabel.socialnetwork.security.Role

import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode
class User {

    transient springSecurityService
    String firstName
    String lastName
    String emailAddress
    String username
    String password
    String gender
    Date birthDate
    Boolean hasConfirmedEmail = false
    Date dateConfirmed
    String id
    Role role

    static transients = ['springSecurityService']

    static constraints = {
        firstName(nullable: false)
        lastName(nullable: false)
        emailAddress(nullable: false, email: true)
        username(nullable: false, matches:"[a-zA-Z0-9]+")
        password(nullable: false, password: true, minSize: 6)
        gender(nullable: false)
        birthDate(nullable: false)
        hasConfirmedEmail(nullable: true)
        dateConfirmed(nullable: true)
        role(nullable: false)
    }

    static mapping = {
        hasConfirmedEmail(defaultValue: false)
        table 'user'
        password column: '`password`'
        id generator:'uuid'
    }

    def beforeInsert() {
        if (password != null) {
            encodePassword()
        }
    }

    def beforeUpdate() {
        if (isDirty('password')) {
            encodePassword()
        }
    }

    protected void encodePassword() {
        password = springSecurityService.encodePassword(password)
    }
}