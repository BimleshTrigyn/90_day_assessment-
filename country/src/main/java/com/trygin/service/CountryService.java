package com.trygin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trygin.entity.Country;
import com.trygin.repo.CountryRepo;

@Service
public class CountryService {
	
	@Autowired
	private CountryRepo repo;
	
	public Integer saveCountry(Country country)
	{
		return repo.save(country).getCountryId();
	}
	
	public Country getCountry(Integer id)
	{
		return repo.getById(id);
	}
	
	
	   

}
