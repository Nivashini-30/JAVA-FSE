package com.cognizant.springlearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.model.Country;
import com.cognizant.springlearn.service.CountryService;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    // Task 1: Single Country Endpoint
    @RequestMapping(value = "/country", method = RequestMethod.GET)
    public Country getCountryIndia() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country india = (Country) context.getBean("in");
        context.close();
        return india;
    }

    // Task 2: Get All Countries Collection
    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        return countryService.getAllCountriesList();
    }

    // Task 3: Get Country Based on Path Variable Code (Case-Insensitive)
    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable("code") String code) {
        return countryService.getCountry(code);
    }
}