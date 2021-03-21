package com.otherservices;

import com.sprigframeworkguru.sfgDependencyInjection.services.GreetingsService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;



@Service
public class ConstructorGreetingService implements GreetingsService {

    @Override
    public String sayHello(){return "HelloWorld from ConstructorGreetingService ";}
}
