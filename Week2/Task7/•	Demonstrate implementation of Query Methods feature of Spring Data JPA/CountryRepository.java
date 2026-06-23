package com.cognizant.country.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.country.model.Country;

public interface CountryRepository extends JpaRepository<Country, String> {

    // Containing text
    List<Country> findByNameContainingIgnoreCase(String name);

    // Starting with text
    List<Country> findByNameStartingWithIgnoreCase(String name);

    // Sort by name
    List<Country> findAllByOrderByNameAsc();

    // Top country
    Country findTopByOrderByNameAsc();
}
