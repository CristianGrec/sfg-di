package com.sprigframeworkguru.sfgDependencyInjection.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingsService{

    @Override
    public String sayHello() {
        return "Setter based GreetingService";
    }
}
