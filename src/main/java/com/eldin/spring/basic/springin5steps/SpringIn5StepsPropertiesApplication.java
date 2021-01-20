package com.eldin.spring.basic.springin5steps;

import com.eldin.spring.basic.springin5steps.basic.BinarySearchImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringIn5StepsPropertiesApplication {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext=
				 new AnnotationConfigApplicationContext(SpringIn5StepsPropertiesApplication.class);) {
			SomeExternalService someExternalService = applicationContext.getBean(SomeExternalService.class);

			System.out.println(someExternalService.getServiceUrl());

		}

	}

}
