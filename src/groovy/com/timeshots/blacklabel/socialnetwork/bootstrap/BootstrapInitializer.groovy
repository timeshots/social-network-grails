/**
 * Created by borrero on 8/5/14.
 */
package com.timeshots.blacklabel.socialnetwork.bootstrap

import com.timeshots.blacklabel.socialnetwork.bootstrap.initializer.BootstrapInitializerComponent

class BootstrapInitializer{

    List<BootstrapInitializerComponent> initializers

    public void execute(){
        initializers.each{ initializer ->
            initializer.initialize()
        }
    }
}