package com.in28minutes.rest.webservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.in28minutes.rest.webservices")
@SpringBootApplication
public class RestfulWebServicesApplication {

	public static void main(String[] args) {
		  ConfigurableApplicationContext applicationContext = SpringApplication.run(RestfulWebServicesApplication.class, args);
//		for (String name : applicationContext.getBeanDefinitionNames()) {
//			System.out.println(name);
//		}
	}
}