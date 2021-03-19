package com.sprigframeworkguru.sfgDependencyInjection.controllers;

import com.sprigframeworkguru.sfgDependencyInjection.services.GreetingsService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
//flag
@Controller
public class I18nController {

    private final GreetingsService greetingsService;

    public I18nController(@Qualifier("i18nService") GreetingsService greetingsService){
        this.greetingsService =greetingsService;
    }

    public String sayGreetings(){
        return  greetingsService.sayHello();
    }
}
