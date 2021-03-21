package com.sprigframeworkguru.sfgDependencyInjection.controllers;

import com.otherservices.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConstructorInjectedControllerTest {
    ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    void setUp(){
        constructorInjectedController = new ConstructorInjectedController(new ConstructorGreetingService());
    }

    @Test
    void getGreetings(){
        System.out.println(constructorInjectedController.getGreeting()) ;
    }
}
