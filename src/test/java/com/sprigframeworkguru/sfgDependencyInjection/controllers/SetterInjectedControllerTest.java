package com.sprigframeworkguru.sfgDependencyInjection.controllers;

import com.otherservices.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SetterInjectedControllerTest {
    SetterInjectedController setterInjectedController;

    @BeforeEach
     void setUp(){
        setterInjectedController = new SetterInjectedController();
        setterInjectedController.setGreetingsService(new ConstructorGreetingService() );
    }

    @Test
    void getGreeting(){
        System.out.println(setterInjectedController.getGreeting());
    }
}
