package com.sprigframeworkguru.sfgDependencyInjection.controllers;

import com.sprigframeworkguru.sfgDependencyInjection.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    void setUp() {
    propertyInjectedController = new PropertyInjectedController();
    propertyInjectedController.greetingsService = new ConstructorGreetingService();
    }

    @Test
    void getGreeting() {
        System.out.println(propertyInjectedController.getGreeting());
    }
}