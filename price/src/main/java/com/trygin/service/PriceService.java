package com.trygin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trygin.entity.Price;
import com.trygin.repo.PriceRepo;

@Service
public class PriceService
{
	@Autowired
	private PriceRepo Repo;
	
	
	public Float savePrice(Price price)
	{
		return Repo.save(price).getPriceId();
	}
	
	@SuppressWarnings("deprecation")
	public Price getPrice(Float id)
	{
		return Repo.getById(id);
	}

}
