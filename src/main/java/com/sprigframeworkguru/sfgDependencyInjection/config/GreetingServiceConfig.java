package com.sprigframeworkguru.sfgDependencyInjection.config;

import com.otherservices.FactoryExample;
import com.sprigframeworkguru.sfgDependencyInjection.repositories.EnglishGreetingRepository;
import com.sprigframeworkguru.sfgDependencyInjection.repositories.EnglishGreetingRepositoryImpl;
import com.sprigframeworkguru.sfgDependencyInjection.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    FactoryExample greetingsFactory(){
        return new FactoryExample();
    }
    //aici numele beanului in context se ia by default numele acestei metode si cu litera mica la inceput
    @Bean
    GreetingsService setterGreetingService(FactoryExample factoryExample){
        return factoryExample.getGreetingsService("yy");
    }

    @Bean
    PropertyInjectedGreetingService propertyInjectedGreetingService(){
        return new PropertyInjectedGreetingService();
    }

    @Primary
    @Bean
    PrimaryGreetingService primaryGreetingService(){
        return new PrimaryGreetingService();
    }

    @Profile("EN")
    @Bean
    public I18nEnglishGreetingService i18nService(EnglishGreetingRepository englishGreetingRepository){
        return new I18nEnglishGreetingService(englishGreetingRepository);
    }

    @Bean
    EnglishGreetingRepositoryImpl englishGreetingRepository(){
        return new EnglishGreetingRepositoryImpl();
    }

    @Profile({"ES","default"})
    @Bean("i18nSpanish")
    I18nSpanishGreetingService ii(){
        return new I18nSpanishGreetingService();
    }
}
