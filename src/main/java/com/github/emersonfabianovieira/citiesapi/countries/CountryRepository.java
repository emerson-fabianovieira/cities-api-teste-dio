package com.github.emersonfabianovieira.citiesapi.countries;

import com.github.emersonfabianovieira.citiesapi.countries.Country;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;

public interface CountryRepository extends JpaRepository <Country, Long> {

    Page<Country> findAll(Pageable page);
}
