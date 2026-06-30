package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.model.Country;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {

    @RequestMapping(value = "/country", method = RequestMethod.GET)
    public Country getCountryIndia() {
        // 1. Load the spring context container pointing to country.xml
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        
        // 2. Extract the configured 'in' bean
        Country india = (Country) context.getBean("in");
        
        // 3. Close the context context to avoid memory leaks
        context.close();
        
        // 4. Return the Java object directly
        return india;
    }
}