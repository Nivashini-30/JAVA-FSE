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

   // Exercise 3 - Add Country
@Transactional
public void addCountry(Country country) {
    countryRepository.save(country);
}

    // Exercise 2
    @Transactional
    public Country findCountryByCode(String countryCode) throws CountryNotFoundException {

        Optional<Country> result = countryRepository.findById(countryCode);

        if (!result.isPresent()) {
            throw new CountryNotFoundException("Country not found");
        }

        Country country = result.get();
        return country;
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