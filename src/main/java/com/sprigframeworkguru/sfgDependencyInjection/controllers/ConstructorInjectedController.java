package com.sprigframeworkguru.sfgDependencyInjection.controllers;

import com.sprigframeworkguru.sfgDependencyInjection.services.GreetingsService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private final GreetingsService greetingsService;


    public ConstructorInjectedController(@Qualifier("constructorGreetingService") GreetingsService greetingsService){
        this.greetingsService = greetingsService;
    }

    public String getGreeting(){
        return greetingsService.sayHello();
    }
}
