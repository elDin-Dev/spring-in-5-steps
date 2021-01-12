package com.eldin.spring.basic.springin5steps;

public class BinarySearchImpl {

    private SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
        super();
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numberToSearchFor){

        int[] sortedNumbers = sortAlgorithm.sort(numbers);

        System.out.println(sortedNumbers);

        return 3;
    }


}