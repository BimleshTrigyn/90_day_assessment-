package com.tryginController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trygin.entity.Country;
import com.trygin.service.CountryService;

@RestController
@RequestMapping("/country")
public class CountryController
{
	@Autowired
	private CountryService service;
	
	
	@PostMapping("/save")
	public String getDetails(@RequestBody Country country)
	{
		Integer id=service.saveCountry(country);
		return "From country id="+id;
	}
	
	@GetMapping("/save")
	public Country getCountry(@RequestBody Integer id)
	{
		 return service.getCountry(id);
	}

}
