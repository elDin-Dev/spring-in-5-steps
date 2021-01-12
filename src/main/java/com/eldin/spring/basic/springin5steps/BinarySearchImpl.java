package com.eldin.spring.basic.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    @Autowired
    @Qualifier("quick")
    private SortAlgorithm sortAlgorithm;


    public int binarySearch(int[] numbers, int numberToSearchFor){

        int[] sortedNumbers = sortAlgorithm.sort(numbers);

        System.out.println(sortedNumbers);

        return 3;
    }


}
