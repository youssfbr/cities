package com.github.youssf.cities.services;

import com.github.youssf.cities.api.dtos.CountryResponseDTO;
import com.github.youssf.cities.api.mappers.CountryMapper;
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
    private final CountryMapper countryMapper;

    @Override
    @Transactional(readOnly = true)
    public Page<CountryResponseDTO> findAll(Pageable pageable) {
        return countryRepository
                .findAll(pageable)
                .map(countryMapper::toDTO);
    }

    @Override
    @Transactional(readOnly = true)
    public CountryResponseDTO findById(Long id) {
        return countryRepository
                .findById(id)
                .map(countryMapper::toDTO)
                .orElseThrow();
    }

}
