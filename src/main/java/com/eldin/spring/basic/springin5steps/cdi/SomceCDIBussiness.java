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


}
