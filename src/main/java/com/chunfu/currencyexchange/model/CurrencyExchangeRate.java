package com.chunfu.currencyexchange.model;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.data.annotation.Id;

public class CurrencyExchangeRate {
	@Id
	private int currencyExchangeRateId;
	private Currency whichCurr;
	private Currency toCurr;
	private Date validDate;
	private BigDecimal rate;
	
	public int getCurrencyExchangeRateId() {
		return currencyExchangeRateId;
	}
	public void setCurrencyExchangeRateId(int currencyExchangeRateId) {
		this.currencyExchangeRateId = currencyExchangeRateId;
	}
	public Currency getWhichCurr() {
		return whichCurr;
	}
	public void setWhichCurr(Currency whichCurr) {
		this.whichCurr = whichCurr;
	}
	public Currency getToCurr() {
		return toCurr;
	}
	public void setToCurr(Currency toCurr) {
		this.toCurr = toCurr;
	}
	public Date getValidDate() {
		return validDate;
	}
	public void setValidDate(Date validDate) {
		this.validDate = validDate;
	}
	public BigDecimal getRate() {
		return rate;
	}
	public void setRate(BigDecimal rate) {
		this.rate = rate;
	}
	
	@Override
	public String toString() {
		 return "CurrencyExchangeRate{" +
	                "whichCurr=" + whichCurr +
	                ", toCurr=" + toCurr +
	                ", validDate=" + validDate +
	                ", rate='" + rate +
	                '}';
	}
	
}
