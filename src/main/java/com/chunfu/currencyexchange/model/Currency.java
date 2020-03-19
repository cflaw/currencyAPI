package com.chunfu.currencyexchange.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "currency")
public class Currency {
	
	@Id
	private int currencyId;
	@NotBlank
	private String name;
	@NotBlank
	private String currencyCode;
	
	public Currency() {
		super();
	}
	
	public Currency (int currencyId, String name, String currencyCode) {
		super();
		this.currencyId = currencyId;
		this.name = name;
		this.currencyCode = currencyCode;
	}

	public int getCurrencyID() {
		return currencyId;
	}

	public void setCurrencyID(int currencyId) {
		this.currencyId = currencyId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
}
