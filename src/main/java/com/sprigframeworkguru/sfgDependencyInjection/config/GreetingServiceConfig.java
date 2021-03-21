package com.sprigframeworkguru.sfgDependencyInjection.config;

import com.otherservices.FactoryExample;
import com.sprigframeworkguru.sfgDependencyInjection.datasource.FakeDataSource;
import com.sprigframeworkguru.sfgDependencyInjection.repositories.EnglishGreetingRepository;
import com.sprigframeworkguru.sfgDependencyInjection.repositories.EnglishGreetingRepositoryImpl;
import com.sprigframeworkguru.sfgDependencyInjection.services.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@PropertySource("classpath:datasource.properties")
@ImportResource("classpath:diConfig.xml")
@Configuration
public class GreetingServiceConfig {

    @Bean
    FakeDataSource fakeDataSource(@Value("${guru.username}")String username,@Value("${guru.password}") String pass,@Value("${guru.jdbcurl}") String jdbbcUrl){
        FakeDataSource fakeDataSource =  new FakeDataSource();
        fakeDataSource.setUser(username);
        fakeDataSource.setPass(pass);
        fakeDataSource.setJdbcUrl(jdbbcUrl);
        return fakeDataSource;
    }

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
