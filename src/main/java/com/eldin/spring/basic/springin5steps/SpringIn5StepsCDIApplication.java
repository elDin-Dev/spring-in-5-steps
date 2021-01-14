package com.eldin.spring.basic.springin5steps;

import com.eldin.spring.basic.springin5steps.cdi.SomceCDIBussiness;
import com.eldin.spring.basic.springin5steps.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringIn5StepsCDIApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsCDIApplication.class);

    public static void main(String[] args) {


        try (AnnotationConfigApplicationContext applicationContext =
                     new AnnotationConfigApplicationContext(SpringIn5StepsCDIApplication.class);) {
            SomceCDIBussiness somceCDIBussiness = applicationContext.getBean(SomceCDIBussiness.class);

            LOGGER.info("===========>{}", somceCDIBussiness.getSomceCDIDAO());

        }


    }

}
