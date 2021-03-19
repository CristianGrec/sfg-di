package com.sprigframeworkguru.sfgDependencyInjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("EN")
@Service("i18nService")
public class I18nEnglishGreetingService implements GreetingsService{
    @Override
    public String sayHello() {
         return "Hello World -EN ";
    }
}
