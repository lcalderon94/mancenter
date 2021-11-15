package com.webapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webapp.models.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

}
