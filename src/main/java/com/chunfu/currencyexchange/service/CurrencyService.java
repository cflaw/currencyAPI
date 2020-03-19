package com.chunfu.currencyexchange.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chunfu.currencyexchange.service.dao.CurrencyRepository;
import com.chunfu.currencyexchange.exception.CurrencyNotFoundException;
import com.chunfu.currencyexchange.model.Currency;

@Service
public class CurrencyService {

	@Autowired
    private CurrencyRepository currencyRepository;

	public List<Currency> getCurrencies() {
        List<Currency> currencies = currencyRepository.findAll();
        return currencies;
    }
	
    public Currency getCurrency(int currencyId) throws CurrencyNotFoundException {
        return currencyRepository.findById(currencyId).orElseThrow(() -> new CurrencyNotFoundException(String.format("Currency is not found with ID: %s", currencyId)));
    }
    
    public Currency getCurrencyByCode(String currencyCode) throws CurrencyNotFoundException {
        return currencyRepository.findByCurrencyCode(currencyCode).orElseThrow(() -> new CurrencyNotFoundException(String.format("Currency is not found with code: %s", currencyCode)));
    }
}
