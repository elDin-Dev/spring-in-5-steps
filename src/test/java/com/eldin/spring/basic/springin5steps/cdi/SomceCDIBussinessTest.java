package com.eldin.spring.basic.springin5steps.cdi;

import com.eldin.spring.basic.springin5steps.SpringIn5StepsCDIApplication;
import org.junit.Test;
import org.junit.runner.RunWith;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringIn5StepsCDIApplication.class)
public class SomceCDIBussinessTest {

    @Autowired
    SomceCDIBussiness bussiness;

    @Test
    public void findGreatest(){
        int greatest = bussiness.findGreatest();

        assertEquals(100,greatest);

    }


}