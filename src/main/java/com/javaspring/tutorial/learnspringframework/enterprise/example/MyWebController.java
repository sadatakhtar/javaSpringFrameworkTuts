package com.javaspring.tutorial.learnspringframework.enterprise.example;

import com.javaspring.tutorial.learnspringframework.business.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyWebController {
    @Autowired
    private BusinessService businessService;

    public MyWebController(BusinessService businessService) {
        System.out.println("Constructor Injection");
        this.businessService = businessService;
    }

    public long returnValueFromBusinessService(){
        return businessService.calculateSum();
    }
}
