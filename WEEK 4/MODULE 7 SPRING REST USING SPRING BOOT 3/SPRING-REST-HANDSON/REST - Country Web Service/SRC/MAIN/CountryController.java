package com.cognizant.springlearn.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.bean.Country;

@RestController
public class CountryController {

    @RequestMapping("/country")
    public Country getCountryIndia() {
        ApplicationContext context =
            new ClassPathXmlApplicationContext("spring.xml");

        Country country = (Country) context.getBean("countryIndia");
        return country;
    }
}
