package com.timeshots.blacklabel.socialnetwork.bootstrap.initializer

import com.timeshots.blacklabel.socialnetwork.Address
import com.timeshots.blacklabel.socialnetwork.User
import com.timeshots.blacklabel.socialnetwork.Contact
import com.timeshots.blacklabel.socialnetwork.Profile
import com.timeshots.blacklabel.socialnetwork.security.Role

class StagingDataInitializer implements BootstrapInitializerComponent{

    @Override
    void initialize(){

        initializeWorkPosition()
        initializeWorkCompany()

        Role roleUser = new Role(authority: 'ROLE_USER').save(flush: true, failOnError: true)
        Role roleAdmin = new Role(authority: 'ROLE_ADMIN').save(flush: true, failOnError: true)

        Address add_one = new Address(state: 'NY', city: 'Windsor', streetAddress: '117 W 2nd St', zipCode: '11111').save(flush: true, failOnError: true)
        Address add_two = new Address(state: 'NY', city: 'Windsor', streetAddress: '117 W 2nd St', zipCode: '22222').save(flush: true, failOnError: true)
        Address add_three = new Address(state: 'NY', city: 'Windsor', streetAddress: '117 W 2nd St', zipCode: "33333").save(flush: true, failOnError: true)

        Contact contact1 = new Contact(emailAddress: 'redwolfgang20@no-spam.ws', phoneNumber: '335-4672', cellphoneNumber: '09105876372').save(flush: true, failonError: true)
        Contact contact2 = new Contact(emailAddress: 'redwolfgang21@no-spam.ws', phoneNumber: '335-4673', cellphoneNumber: '09105976373').save(flush: true, failonError: true)
        Contact contact3 = new Contact(emailAddress: 'redwolfgang22@no-spam.ws', phoneNumber: '335-4674', cellphoneNumber: '09106076374').save(flush: true, failonError: true)

        User larry = new User(firstName: 'Larry', lastName: 'Borrero', emailAddress: 'redwolfgang20@gmail.com', username: 'redwolfgang20', password: 'redwolfgang1990', gender: 'Male', birthDate: new Date(1990,05,11), hasConfirmedEmail: true, dateConfirmed: new Date(2014,06,11), role: roleAdmin).save(flush: true, failOnError: true)
        User lorina = new User(firstName: 'Lorina', lastName: 'Borrero', emailAddress: 'lorina@gmail.com', username: 'lorina', password: 'lorina_yhads', gender: 'Female', birthDate: new Date(1990,05,11), hasConfirmedEmail: true, dateConfirmed: new Date(2014,06,11), role: roleUser).save(flush: true, failOnError: true)
        User whitehot = new User(firstName: 'White', lastName: 'Hot', emailAddress: 'whitehot@gmail.com', username: 'white', password: 'whitehot', gender: 'Male', birthDate: new Date(1990,05,11), hasConfirmedEmail: true, dateConfirmed: new Date(2014,06,11), role: roleUser).save(flush: true, failOnError: true)

        Profile profile1 = new Profile(interestedIn: 'Female', religion: 'Roman Catholic', civilStatus: 'Single', nationality: 'Pilipino', user: larry, address: add_one, contact: contact1).save(flush: true, failOnError: true)
        Profile profile2 = new Profile(interestedIn: 'Male', religion: 'Roman Catholic', civilStatus: 'Single', nationality: 'Pilipino', user: lorina, address: add_two, contact: contact2).save(flush: true, failOnError: true)
        Profile profile3 = new Profile(interestedIn: 'Female', religion: 'Roman Catholic', civilStatus: 'Married', nationality: 'Pilipino', user: whitehot, address: add_three, contact: contact3).save(flush: true, failOnError: true)
    }

    private void initializeWorkPosition(){

        /****************************************************
         *                                                  *
         *      Agriculture, Food and Natural Resources     *
         *                                                  *
         ***************************************************/

        /** Agribusiness Systems */
        new WorkPosition(jobTitle:'Financial Managers (Branch)').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Financial Managers (Department)').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Purchasing Agents').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Buyers, Farm Products').save(flush: true, failOnError: true)
        /** Agribusiness Systems */
        new WorkPosition(jobTitle:'Animal Scientists').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Veterinarians').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Veterinary Technologists and Technicians').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Zoologists and Wildlife Biologists').save(flush: true, failOnError: true)
        /** Environmental Service Systems */
        new WorkPosition(jobTitle:'Environmental Engineers').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Environmental Science').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Protection Technicians, Including Health').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Water and Liquid Waste Treatment Plant and System Operators').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Cartographers').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Geological and Petroleum Technicians').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Geological Sample Test Technicians').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Natural Sciences Managers').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Foresters').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Soil and Plant Scientists').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Soil and Water Conservationists').save(flush: true, failOnError: true)

        new WorkPosition(jobTitle:'Construction Managers').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'First-Line Supervisors/Managers of Construction Trades').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Solar Energy Installation Managers').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Solar Photovoltaic Installers').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Architects, Except Landscape and Naval').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Civil Engineers').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Interior Designers').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Landscape Architects').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Mechanical Drafters').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Surveyors').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Geothermal Technicians').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Stationary Engineers and Boiler Operators').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Wind Turbine Service Technicians').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Graphic Designers').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Sound Engineering Technicians').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Broadcast News Analysts').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Copy Writers').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Editors').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Radio and Television Announcers').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Reporters and Correspondents').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Choreographers').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Dancers').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Directors- Stage').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Motion Pictures').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Television, and Radio').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Entertainers and Performers').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Sports and Related Workers').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Film and Video Editors').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Makeup Artists').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Theatrical and Performance').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Music Directors and Composers').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Musicians and Singers').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Musicians, Instrumental').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Producers and Directors').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Program Directors').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Talent Directors').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Technical Directors/Managers').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Writers and Authors').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Desktop Publishers').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Job Printers').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Telecommunications Line Installers and Repairers').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Commercial and Industrial Designers').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Craft Artists').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Fine Artists, Including Painters').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Sculptors, and Illustrators').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Multi-Media Artists and Animators').save(flush: true, failOnError: true)
        new WorkPosition(jobTitle:'Photographers').save(flush: true, failOnError: true)
        //new WorkPosition('').save(flush: true, failOnError: true)
    }

    private void initializeWorkCompany(){
        new WorkCompany(companyName:'Visayas State University (Main Campus)', companyAddress:'Brgy Visca Baybay City, 6521 Leyte (Eastern Visayas)', companyType:'College/Universities').save(flush: true, failOnError: true)
        //new WorkCompany(companyName:'', companyAddress:'', companyType:'').save(flush: true, failOnError: true)
    }
}