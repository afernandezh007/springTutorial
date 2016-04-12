package com.babel;

import com.babel.controller.TestController;
import com.babel.dto.TestDto;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("controllers.xml",
                "services.xml",
                "daos.xml");

        TestController testController = (TestController) context.getBean("testController");

        TestDto dto = testController.read();

        System.out.println("Data readed: " + dto.getData());

        dto.setData(dto.getData() + " modif");

        dto = testController.update(dto);

        System.out.println("Data updated: " + dto.getData());

    }

}
