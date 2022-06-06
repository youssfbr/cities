package com.github.youssf.cities.repositories;

import com.github.youssf.cities.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICountryRepository extends JpaRepository<Country, Long> {

}
