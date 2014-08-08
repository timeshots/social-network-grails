package com.timeshots.blacklabel.socialnetwork.marshalling

class CustomObjectMarshallers{
    List marshallers = []

    def register(){
        marshallers.each{
            it.register()
        }
    }
}