package com.sprigframeworkguru.sfgDependencyInjection.services;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
@Component
public class PrototypeBean {
    public PrototypeBean() {
        System.out.println("prototype created");
    }

    public String getMyScope(){return "i am prototype"; }
}
