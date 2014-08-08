package com.timeshots.blacklabel.socialnetwork.bootstrap.initializer

import com.timeshots.blacklabel.socialnetwork.marshalling.CustomObjectMarshallers

class MarshallerInitializer implements BootstrapInitializerComponent{
    CustomObjectMarshallers customObjectMarshallers

    @Override
    void initialize(){
        customObjectMarshallers.register()
    }
}