package com.sprigframeworkguru.sfgDependencyInjection.services;

import org.springframework.stereotype.Service;

import java.util.Optional;
//flag
@Service
public class ConstructorGreetingService implements GreetingsService{

    @Override
    public String sayHello(){return "HelloWorld from ConstructorGreetingService ";}
}
