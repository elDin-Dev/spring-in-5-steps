package com.eldin.spring.basic.springin5steps;

//import ch.qos.logback.classic.spi.LoggerComparator;

import com.eldin.spring.basic.springin5steps.basic.BinarySearchImpl;
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
public class SpringIn5StepsScopeApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext applicationContext =
                     new AnnotationConfigApplicationContext(SpringIn5StepsScopeApplication.class);) {


			PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);

			PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);

			LOGGER.info("------>personDAO{}", personDAO);
			LOGGER.info("------>personDAO.getJdbcConnection{}", personDAO.getJdbcConnection());

			LOGGER.info("------>personDAO2{}", personDAO2);
			LOGGER.info("------>personDAO.getJdbcConnection2{}", personDAO2.getJdbcConnection());


        }

/*		ApplicationContext applicationContext=
		SpringApplication.run(SpringIn5StepsScopeApplication.class, args);

		PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);

		PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);

		LOGGER.info("------>personDAO{}", personDAO);
		LOGGER.info("------>personDAO.getJdbcConnection{}", personDAO.getJdbcConnection());

		LOGGER.info("------>personDAO2{}", personDAO2);
		LOGGER.info("------>personDAO.getJdbcConnection2{}", personDAO2.getJdbcConnection());*/


    }

}
