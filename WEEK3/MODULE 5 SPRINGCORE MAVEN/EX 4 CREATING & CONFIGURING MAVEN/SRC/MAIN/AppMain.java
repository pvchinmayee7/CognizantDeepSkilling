package com.library.maven.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.maven.service.HelloService;

public class AppMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        HelloService service = (HelloService) context.getBean("helloService");
        service.sayHello();
    }
}
