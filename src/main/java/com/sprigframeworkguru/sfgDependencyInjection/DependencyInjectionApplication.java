package com.sprigframeworkguru.sfgDependencyInjection;

import com.sprigframeworkguru.sfgDependencyInjection.controllers.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com/otherservices","com.sprigframeworkguru.sfgDependencyInjection"})
@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {

		ApplicationContext ctx =  SpringApplication.run(DependencyInjectionApplication.class, args);

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayGreetings());

		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println("-----Primary-----");
		System.out.println(myController.helloWorld());

		System.out.println("------PropertyInjection-------");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());

		System.out.println("------SetterInjection---------");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());


		System.out.println("------ConstructorInjected------");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
