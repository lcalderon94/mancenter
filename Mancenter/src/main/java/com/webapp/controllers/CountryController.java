package com.webapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.webapp.models.Country;
import com.webapp.services.CountryService;

@Controller
public class CountryController {
	
	@Autowired
	private CountryService countryService;

	@GetMapping("/countries")
	public String getCountries(Model model) {
		
		List<Country> countryList = countryService.getCountries();
		
		model.addAttribute("countries",countryList);
		return "country";
	}
	
	@PostMapping("/countries/addNew")
	public String addCountry(Country country) {
		countryService.save(country);
		
		return "redirect:/countries";
	}
}
