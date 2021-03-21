package com.sprigframeworkguru.sfgDependencyInjection.services;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {
    public SingletonBean() {
        System.out.println("singleton created");
    }

    public String getMyScope(){
        return "I'm a singleton";
    }
}
