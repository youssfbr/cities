package com.github.youssf.cities.api.dtos;

import lombok.Getter;

import lombok.Setter;

@Getter
@Setter
public class CountryResponseDTO {

    private Long id;
    private String name;
    private String portugueseName;
    private String code;
    private Integer bacen;

}
