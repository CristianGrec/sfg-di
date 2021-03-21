package com.otherservices;

import com.sprigframeworkguru.sfgDependencyInjection.services.GreetingsService;
import com.sprigframeworkguru.sfgDependencyInjection.services.SetterGreetingService;
import org.springframework.stereotype.Service;

import java.nio.channels.SeekableByteChannel;

public class FactoryExample  {

    public GreetingsService getGreetingsService(String greetingType){
        switch (greetingType){
            case "xx":return new ConstructorGreetingService();
            case "yy":return new SetterGreetingService();
            default : return new SetterGreetingService();
        }

    }
}
