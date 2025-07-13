package com.cognizant.springlearn1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn1.model.Country;

@Service
public class CountryService {

    @Autowired
    private ApplicationContext context;

    public Country getCountry(String code) {
        List<Country> countryList = List.of(
            (Country) context.getBean("in"),
            (Country) context.getBean("us"),
            (Country) context.getBean("jp")
        );

        return countryList.stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Country not found: " + code));
    }
}

