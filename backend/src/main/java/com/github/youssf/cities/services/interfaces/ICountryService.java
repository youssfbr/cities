package com.github.youssf.cities.services.interfaces;

import com.github.youssf.cities.api.dtos.CountryResponseDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICountryService {

    Page<CountryResponseDTO> findAll(Pageable pageable);
    CountryResponseDTO findById(Long id);
}
