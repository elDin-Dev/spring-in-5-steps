package com.eldin.spring.basic.springin5steps;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalService {

    @Value("${external.service.url}")
    private String Url;

    public String getServiceUrl(){
        return this.Url;
    }
}
