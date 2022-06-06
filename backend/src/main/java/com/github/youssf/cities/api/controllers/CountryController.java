package com.github.youssf.cities.api.controllers;

import com.github.youssf.cities.entities.Country;
import com.github.youssf.cities.services.interfaces.ICountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/countries")
public class CountryController {

    private final ICountryService countryService;

    @GetMapping
    public List<Country> findAll() {
        return countryService.findAll();
    }

}
