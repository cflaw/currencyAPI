package com.chunfu.currencyexchange.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chunfu.currencyexchange.service.CurrencyService;
import com.chunfu.currencyexchange.exception.CurrencyNotFoundException;
import com.chunfu.currencyexchange.model.Currency;

@RestController
public class CurrencyController {
	
	@Autowired
    private CurrencyService currencyService;
	
	@RequestMapping("/")
    public String index() {
        return "This is a currency API";
    }
	
	@GetMapping("/api/v1/currencies")
	public List<Currency> getCurrencies() {
		List<Currency> result = currencyService.getCurrencies();
        return result;
	}
	
	/*
	@GetMapping("/api/v1/currency/{currencyId}")
	public Currency getCurrencyById(@PathVariable int currencyId) throws CurrencyNotFoundException {
		Currency result = currencyService.getCurrency(currencyId);
        return result;
	}
	*/
	
	@GetMapping("/api/v1/currency/{currencyCode}")
	public Currency getCurrencyByCode(@PathVariable String currencyCode) throws CurrencyNotFoundException {
		Currency result = currencyService.getCurrencyByCode(currencyCode);
        return result;
	}
	
}
