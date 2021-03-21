package com.sprigframeworkguru.sfgDependencyInjection.config;

import com.sprigframeworkguru.sfgDependencyInjection.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    //aici numele beanului in context se ia by default numele acestei metode si cu litera mica la inceput
    @Bean
    SetterGreetingService setterGreetingService(){
        return new SetterGreetingService();
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
    public I18nEnglishGreetingService i18nService(){
        return new I18nEnglishGreetingService();
    }

    @Profile({"ES","default"})
    @Bean("i18nSpanish")
    I18nSpanishGreetingService ii(){
        return new I18nSpanishGreetingService();
    }
}
