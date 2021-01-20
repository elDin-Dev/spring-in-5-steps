package com.eldin.spring.basic.springin5steps.cdi;

import com.eldin.spring.basic.springin5steps.SpringIn5StepsCDIApplication;
import org.junit.Test;
import org.junit.runner.RunWith;


import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class SomceCDIBussinessTest {


    @InjectMocks
    SomceCDIBussiness bussiness;

    @Mock
    SomceCDIDAO daoMock;

    @Test
    public void findGreatest(){

        Mockito.when(daoMock.getData()).thenReturn(new int[]{2,4});

        int greatest = bussiness.findGreatest();

        assertEquals(4,greatest);

    }


}