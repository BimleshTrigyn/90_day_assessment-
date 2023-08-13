package com.trygin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trygin.entity.Price;
import com.trygin.service.PriceService;

@RestController
@RequestMapping("/price")
public class PriceController 
{
	@Autowired
	private PriceService service;
	@PostMapping("/save")
	public String getDetails(@RequestBody Price price)
	{
	Float id=service.savePrice(price);
		return "price id ="+ id;
	}
	
	public Price getPrice(@RequestBody Float id)
	{
	 return service.getPrice(id);
		 
	}

}
