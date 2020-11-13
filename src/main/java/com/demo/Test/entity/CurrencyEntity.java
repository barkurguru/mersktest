package com.demo.Test.entity;

import java.io.Serializable;

public class CurrencyEntity implements Serializable {
	
	private static final long serialVersionUID = 2535957131765313504L;
	public String currency;
	public String amount;
	
	public CurrencyEntity() {
		
	}

	public CurrencyEntity(String currency, String amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
	

}
