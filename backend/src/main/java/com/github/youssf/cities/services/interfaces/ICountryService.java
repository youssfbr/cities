package com.github.youssf.cities.services.interfaces;

import com.github.youssf.cities.entities.Country;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICountryService {

    Page<Country> findAll(Pageable pageable);
}
