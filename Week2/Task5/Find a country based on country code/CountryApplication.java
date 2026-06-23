package com.cognizant.country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cognizant.country.exception.CountryNotFoundException;
import com.cognizant.country.model.Country;
import com.cognizant.country.service.CountryService;

@SpringBootApplication
public class CountryApplication implements CommandLineRunner {

    @Autowired
    private CountryService countryService;

    public static void main(String[] args) {
        SpringApplication.run(CountryApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        getCountryTest();
    }

    private void getCountryTest() {
        try {
            System.out.println("Start");

            Country country = countryService.findCountryByCode("IN");

            System.out.println("Country : " + country);

            System.out.println("End");

        } catch (CountryNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}