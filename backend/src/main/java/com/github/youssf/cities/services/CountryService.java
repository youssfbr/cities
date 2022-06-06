package com.github.youssf.cities.services;

import com.github.youssf.cities.entities.Country;
import com.github.youssf.cities.repositories.ICountryRepository;
import com.github.youssf.cities.services.interfaces.ICountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
public class CountryService implements ICountryService {

    private final ICountryRepository countryRepository;

    @Override
    @Transactional(readOnly = true)
    public Page<Country> findAll(Pageable pageable) {
        return countryRepository.findAll(pageable);
    }

}
