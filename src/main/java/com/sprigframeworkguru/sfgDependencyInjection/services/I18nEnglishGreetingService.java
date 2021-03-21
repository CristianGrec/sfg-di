package com.sprigframeworkguru.sfgDependencyInjection.services;

import com.sprigframeworkguru.sfgDependencyInjection.repositories.EnglishGreetingRepository;
import com.sprigframeworkguru.sfgDependencyInjection.repositories.EnglishGreetingRepositoryImpl;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
//flag
public class I18nEnglishGreetingService implements GreetingsService{

    private final EnglishGreetingRepository englishGreetingRepository;

    public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayHello() {
         return "Hello World -EN ";
    }
}
