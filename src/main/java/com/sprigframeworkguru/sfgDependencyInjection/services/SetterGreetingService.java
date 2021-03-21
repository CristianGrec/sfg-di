package com.sprigframeworkguru.sfgDependencyInjection.services;

import org.springframework.stereotype.Service;
//flag

public class SetterGreetingService implements GreetingsService{

    @Override
    public String sayHello() {
        return "Setter based GreetingService";
    }
}
