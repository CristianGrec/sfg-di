package com.sprigframeworkguru.sfgDependencyInjection.controllers;

import com.sprigframeworkguru.sfgDependencyInjection.services.GreetingsService;
import org.springframework.stereotype.Controller;
//flag
@Controller
public class MyController {

    private final GreetingsService greetingsService;

    public MyController(GreetingsService greetingsService){
        this.greetingsService = greetingsService;
    }

    public String helloWorld( ){

        return greetingsService.sayHello();
    }
}
