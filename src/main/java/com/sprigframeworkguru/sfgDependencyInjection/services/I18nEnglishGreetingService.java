package com.sprigframeworkguru.sfgDependencyInjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
//flag
public class I18nEnglishGreetingService implements GreetingsService{
    @Override
    public String sayHello() {
         return "Hello World -EN ";
    }
}
