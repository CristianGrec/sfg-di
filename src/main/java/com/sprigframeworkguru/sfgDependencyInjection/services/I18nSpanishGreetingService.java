package com.sprigframeworkguru.sfgDependencyInjection.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
//flag
@Profile({"ES","default"})
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingsService{

    @Override
    public String sayHello(){
        return "Hola Mundo";
    }
}
