package com.chunfu.currencyexchange.exception;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CurrencyNotFoundException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4572458609214263640L;
	@SuppressWarnings("unused")
	private int currencyId;
	
	public CurrencyNotFoundException() {
        super();
    }
	
	public CurrencyNotFoundException(String message) {
		super(message);
    }
}