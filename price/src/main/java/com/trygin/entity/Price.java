package com.trygin.entity;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="price_table")
public class Price {
	
	@Id
	private Float priceId;
	
	private BigDecimal pricevalue;
	
	private String priceCountry;

	public Float getPriceId() {
		return priceId;
	}

	public void setPriceId(Float priceId) {
		this.priceId = priceId;
	}

	public BigDecimal getPricevalue() {
		return pricevalue;
	}

	public void setPricevalue(BigDecimal pricevalue) {
		this.pricevalue = pricevalue;
	}

	public String getPriceCountry() {
		return priceCountry;
	}

	public void setPriceCountry(String priceCountry) {
		this.priceCountry = priceCountry;
	}

	@Override
	public String toString() {
		return "Price [priceId=" + priceId + ", pricevalue=" + pricevalue + ", priceCountry=" + priceCountry + "]";
	}

	public Price() {
		super();
	}

	public Price(Float priceId, BigDecimal pricevalue, String priceCountry) {
		super();
		this.priceId = priceId;
		this.pricevalue = pricevalue;
		this.priceCountry = priceCountry;
	}
	
	
	
	

}
