package com.github.youssf.cities.services;

import com.github.youssf.cities.entities.Country;
import com.github.youssf.cities.repositories.ICountryRepository;
import com.github.youssf.cities.services.interfaces.ICountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CountryService implements ICountryService {

    private final ICountryRepository countryRepository;

    @Override
    @Transactional(readOnly = true)
    public List<Country> findAll() {
        return countryRepository.findAll();
    }

}
