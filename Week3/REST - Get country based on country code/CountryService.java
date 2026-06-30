package com.cognizant.springlearn.service;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import com.cognizant.springlearn.model.Country;

@Service
public class CountryService {

    @SuppressWarnings("unchecked")
    public List<Country> getAllCountriesList() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        List<Country> countries = (List<Country>) context.getBean("countryList");
        context.close();
        return countries;
    }

    public Country getCountry(String code) {
        List<Country> countries = getAllCountriesList();

        // Using a clean Lambda expression to find the country case-insensitively
        return countries.stream()
                .filter(country -> country.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null); 
    }
}