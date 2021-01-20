package com.eldin.spring.basic.springin5steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomceCDIBussiness {

    public SomceCDIDAO getSomceCDIDAO() {
        return somceCDIDAO;
    }

    public void setSomceCDIDAO(SomceCDIDAO somceCDIDAO) {
        this.somceCDIDAO = somceCDIDAO;
    }

    @Inject
    private SomceCDIDAO somceCDIDAO;


    public int findGreatest(){
        int greatest = Integer.MIN_VALUE;
        int [] numbers = somceCDIDAO.getData();
        for (int val : numbers) {
            if (val>greatest){
                greatest=val;
            }
        }
        return greatest;
    }

}
