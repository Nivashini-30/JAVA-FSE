package com.cognizant.country.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.country.model.Country;
import com.cognizant.country.repository.CountryRepository;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    // Find by code
    public Country getCountry(String code) {
        return countryRepository.findById(code).orElse(null);
    }

    // Add country
    public Country addCountry(Country country) {
        return countryRepository.save(country);
    }

    // Update country
    public Country updateCountry(Country country) {
        return countryRepository.save(country);
    }

    // Delete country
    public void deleteCountry(String code) {
        countryRepository.deleteById(code);
    }

    // Search by partial name
    public List<Country> searchCountries(String name) {
        return countryRepository.findByNameContainingIgnoreCase(name);
    }
}