package com.cognizant.country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.cognizant.country.model.Country;
import com.cognizant.country.service.CountryService;

@Component
public class CountryTest implements CommandLineRunner {

    @Autowired
    private CountryService service;

    @Override
    public void run(String... args) {

        System.out.println("Find Country:");
        System.out.println(service.getCountry("IN"));

        System.out.println("\nAdd Country:");
        Country c1 = new Country("XX", "Test Country");
        service.addCountry(c1);
        System.out.println(service.getCountry("XX"));

        System.out.println("\nUpdate Country:");
        c1.setName("Updated Country");
        service.updateCountry(c1);
        System.out.println(service.getCountry("XX"));

        System.out.println("\nSearch Country:");
        service.searchCountries("Ind")
               .forEach(System.out::println);

        System.out.println("\nDelete Country:");
        service.deleteCountry("XX");
        System.out.println("Deleted Successfully");
    }
}