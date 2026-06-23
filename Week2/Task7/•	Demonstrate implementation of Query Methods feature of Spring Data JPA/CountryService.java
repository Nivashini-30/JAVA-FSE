package com.cognizant.country.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cognizant.country.exception.CountryNotFoundException;
import com.cognizant.country.model.Country;
import com.cognizant.country.repository.CountryRepository;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    // Add Country
    @Transactional
    public void addCountry(Country country) {
        countryRepository.save(country);
    }

    // Find Country By Code
    @Transactional
    public Country findCountryByCode(String countryCode) throws CountryNotFoundException {

        Optional<Country> result = countryRepository.findById(countryCode);

        if (!result.isPresent()) {
            throw new CountryNotFoundException("Country not found");
        }

        return result.get();
    }

    // Update Country
    public Country updateCountry(Country country) {
        return countryRepository.save(country);
    }

    // Delete Country
    public void deleteCountry(String code) {
        countryRepository.deleteById(code);
    }

    // Search by partial name
    public List<Country> searchCountries(String name) {
        return countryRepository.findByNameContainingIgnoreCase(name);
    }

    // Query Method - Containing
    public List<Country> searchByContaining(String text) {
        return countryRepository.findByNameContainingIgnoreCase(text);
    }

    // Query Method - Starting With
    public List<Country> searchByStartingWith(String text) {
        return countryRepository.findByNameStartingWithIgnoreCase(text);
    }

    // Query Method - Sorting
    public List<Country> getCountriesSorted() {
        return countryRepository.findAllByOrderByNameAsc();
    }

    // Query Method - Top Record
    public Country getTopCountry() {
        return countryRepository.findTopByOrderByNameAsc();
    }
}
