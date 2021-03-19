package com.sprigframeworkguru.sfgDependencyInjection.controllers;

import com.sprigframeworkguru.sfgDependencyInjection.services.GreetingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedController {

    private GreetingsService greetingsService;

    @Qualifier("setterGreetingService")
    @Autowired
    public void setGreetingsService( GreetingsService greetingsService ){
        this.greetingsService = greetingsService;
    }

    public String getGreeting(){
        return greetingsService.sayHello();
    }
}
