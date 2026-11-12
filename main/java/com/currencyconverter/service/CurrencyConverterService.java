package com.currencyconverter.service;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Service
public class CurrencyConverterService {

    public BigDecimal convert(BigDecimal amount, BigDecimal exchangeRate) {
        if (amount == null || exchangeRate == null) {
            throw new IllegalArgumentException("Amount and exchange rate cannot be null");
        }
        if (amount.compareTo(BigDecimal.ZERO) < 0 || exchangeRate.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Amount and exchange rate must be non-negative");
        }
        return amount.multiply(exchangeRate).setScale(2, RoundingMode.HALF_UP);
    }
}