package com.timeshots.blacklabel.socialnetwork.bootstrap.initializer

import com.timeshots.blacklabel.socialnetwork.Address
import com.timeshots.blacklabel.socialnetwork.User
import com.timeshots.blacklabel.socialnetwork.Contact
import com.timeshots.blacklabel.socialnetwork.Profile

class StagingDataInitializer implements BootstrapInitializerComponent{

    @Override
    void initialize(){
        Address add_one = new Address(state: 'NY', city: 'Windsor', streetAddress: '117 W 2nd St', zipCode: '11111').save(flush: true, failOnError: true)
        Address add_two = new Address(state: 'NY', city: 'Windsor', streetAddress: '117 W 2nd St', zipCode: '22222').save(flush: true, failOnError: true)
        Address add_three = new Address(state: 'NY', city: 'Windsor', streetAddress: '117 W 2nd St', zipCode: "33333").save(flush: true, failOnError: true)

        Contact contact1 = new Contact(emailAddress: 'redwolfgang20@no-spam.ws', phoneNumber: '335-4672', cellphoneNumber: '09105876372').save(flush: true, failonError: true)
        Contact contact2 = new Contact(emailAddress: 'redwolfgang21@no-spam.ws', phoneNumber: '335-4673', cellphoneNumber: '09105976373').save(flush: true, failonError: true)
        Contact contact3 = new Contact(emailAddress: 'redwolfgang22@no-spam.ws', phoneNumber: '335-4674', cellphoneNumber: '09106076374').save(flush: true, failonError: true)

        User larry = new User(firstName: 'Larry', lastName: 'Borrero', emailAddress: 'redwolfgang20@gmail.com', username: 'redwolfgang20', password: 'redwolfgang1990', hasConfirmedEmail: true).save(flush: true, failOnError: true)
        User lorina = new User(firstName: 'Lorina', lastName: 'Borrero', emailAddress: 'lorina@gmail.com', username: 'lorina', password: 'lorina_yhads', hasConfirmedEmail: true).save(flush: true, failOnError: true)
        User whitehot = new User(firstName: 'White', lastName: 'Hot', emailAddress: 'whitehot@gmail.com', username: 'white', password: 'whitehot', hasConfirmedEmail: true).save(flush: true, failOnError: true)

        Profile profile1 = new Profile(birthDate: new Date(1990, 05, 11), gender: 'Male', interestedIn: 'Female', religion: 'Roman Catholic', civilStatus: 'Single', nationality: 'Pilipino', user: larry, address: add_one, contact: contact1).save(flush: true, failOnError: true)
    }
}