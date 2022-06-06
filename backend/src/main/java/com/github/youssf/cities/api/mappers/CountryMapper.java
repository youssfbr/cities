package com.github.youssf.cities.api.mappers;

import com.github.youssf.cities.api.dtos.CountryResponseDTO;
import com.github.youssf.cities.entities.Country;
import org.springframework.stereotype.Component;

@Component
public class CountryMapper {

    public CountryResponseDTO toDTO(Country country) {
        CountryResponseDTO countryResponseDTO = new CountryResponseDTO();
        countryResponseDTO.setId(country.getId());
        countryResponseDTO.setName(country.getName());
        countryResponseDTO.setPortugueseName(country.getPortugueseName());
        countryResponseDTO.setCode(country.getCode());
        countryResponseDTO.setBacen(country.getBacen());
        return countryResponseDTO;
    }

}
