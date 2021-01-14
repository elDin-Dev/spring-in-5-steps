package com.eldin.spring.basic.springin5steps.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    @Qualifier("quick")
    private SortAlgorithm sortAlgorithm;

    @PostConstruct
    public void postConstruct(){
        logger.info("postConstruct: {}",this);
    }

    public int binarySearch(int[] numbers, int numberToSearchFor){

        int[] sortedNumbers = sortAlgorithm.sort(numbers);

        System.out.println(sortedNumbers);

        return 3;
    }

    @PreDestroy
    public void preDestroy(){
        logger.info("preDestroy: {}",this);
    }


}
