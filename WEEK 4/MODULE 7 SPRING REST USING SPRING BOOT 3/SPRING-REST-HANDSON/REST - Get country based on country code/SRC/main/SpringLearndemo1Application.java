package com.cognizant.springlearn1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:country.xml")
public class SpringLearndemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringLearndemo1Application.class, args);
    }
}
