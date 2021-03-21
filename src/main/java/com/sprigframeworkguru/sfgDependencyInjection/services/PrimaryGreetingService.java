package com.sprigframeworkguru.sfgDependencyInjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
//flag

public class PrimaryGreetingService implements GreetingsService{
    @Override
    public String sayHello() {
        return "Hello world from the primary bean";
    }
}
