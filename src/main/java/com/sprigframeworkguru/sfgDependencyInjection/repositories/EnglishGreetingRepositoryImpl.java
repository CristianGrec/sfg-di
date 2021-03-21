package com.sprigframeworkguru.sfgDependencyInjection.repositories;

public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository{
    @Override
    public String getGreeting() {
        return "Hellp EN from engRepo";
    }
}
