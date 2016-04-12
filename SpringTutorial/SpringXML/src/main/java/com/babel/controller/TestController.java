package com.babel.controller;

import com.babel.dto.TestDto;
import com.babel.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by antonio.fernandez on 12/04/2016.
 */
public class TestController {

    private ITestService testService;

    public TestController() {
        super();
    }


    public TestDto read(){
        System.out.println("Controller - read()");
        return getTestService().readData();
    }

    public TestDto update(TestDto dto){
        System.out.println("Controller - update()");
        return getTestService().updateData(dto);
    }


    public ITestService getTestService() {
        return testService;
    }

    public void setTestService(ITestService testService) {
        this.testService = testService;
    }
}
