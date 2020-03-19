package com.chunfu.currencyexchange.service.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chunfu.currencyexchange.model.Currency;

@Repository
public interface CurrencyRepository extends JpaRepository<Currency, Integer> {
	Optional<Currency> findByCurrencyCode(String currencyCode);
}
