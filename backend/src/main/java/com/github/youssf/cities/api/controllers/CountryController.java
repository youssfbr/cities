package com.github.youssf.cities.api.controllers;

import com.github.youssf.cities.api.dtos.CountryResponseDTO;
import com.github.youssf.cities.services.interfaces.ICountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/countries")
public class CountryController {

    private final ICountryService countryService;

    @GetMapping
    public Page<CountryResponseDTO> findAll(Pageable pageable) {
        return countryService.findAll(pageable);
    }

    @GetMapping("{countryId}")
    public CountryResponseDTO findByIdAll(@PathVariable Long countryId) {
        return countryService.findById(countryId);
    }

}
