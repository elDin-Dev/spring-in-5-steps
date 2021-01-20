package com.eldin.spring.basic.springin5steps.cdi;

import javax.inject.Named;

@Named
public class SomceCDIDAO {

    public int[] getData() {
        return new int[] {5,89,100};
    }


}
