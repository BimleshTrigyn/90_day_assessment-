package com.trygin.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="country_table")
public class Country {
	
	@Id
	private Integer CountryId;
	
	  private String name;
	  private String capital;
	public Integer getCountryId() {
		return CountryId;
	}
	public void setCountryId(Integer countryId) {
		CountryId = countryId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	@Override
	public String toString() {
		return "Country [CountryId=" + CountryId + ", name=" + name + ", capital=" + capital + "]";
	}
	public Country(Integer countryId, String name, String capital) {
		super();
		CountryId = countryId;
		this.name = name;
		this.capital = capital;
	}
	public Country() {
		super();
	}
	  
	  

}
