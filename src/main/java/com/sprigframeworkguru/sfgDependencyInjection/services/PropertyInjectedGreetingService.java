package com.sprigframeworkguru.sfgDependencyInjection.services;

import org.springframework.stereotype.Service;
//flag

public class PropertyInjectedGreetingService implements GreetingsService{
    @Override
    public String sayHello() {
        return "propertyInjectedGreetingService hello world ";
    }
}
