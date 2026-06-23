package com.cognizant.country;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

        System.out.println("Search by Containing 'Ind'");
        countryService.searchByContaining("Ind")
                .forEach(System.out::println);

        System.out.println("\nSearch by Starting 'Ind'");
        countryService.searchByStartingWith("Ind")
                .forEach(System.out::println);

        System.out.println("\nTop Country");
        System.out.println(countryService.getTopCountry());

        System.out.println("\nSorted Countries");
        countryService.getCountriesSorted()
                .stream()
                .limit(10)
                .forEach(System.out::println);
    }
}
