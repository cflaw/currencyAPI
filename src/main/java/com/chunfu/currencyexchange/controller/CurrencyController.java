package com.chunfu.currencyexchange.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CurrencyController {
	@GetMapping("/v1/currencies")
	public String getCurrencies() {
		return "Test get all currencies";
	}
	
	@GetMapping("/v1/currencies/usd")
	public String getUSDConversion(@RequestHeader String name) {
		return "Test get USD from "+name;
	}
	
}
