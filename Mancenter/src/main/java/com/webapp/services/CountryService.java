package com.webapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.models.Country;
import com.webapp.repositories.CountryRepository;

@Service
public class CountryService {
	
	@Autowired
	private CountryRepository countryRepo;

	public List<Country> getCountries(){
		return countryRepo.findAll();
	}
	
	public void save(Country country) {
		countryRepo.save(country);
	}
}
