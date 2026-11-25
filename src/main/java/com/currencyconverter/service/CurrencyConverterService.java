package com.currencyconverter.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Service responsible for performing currency conversion calculations using BigDecimal to avoid *floating-point precision errors.
 */

@Service
public class CurrencyConverterService {
        //SLF4J logger created for the service class
        private static final Logger log = LoggerFactory.getLogger(CurrencyConverterService.class);
    /**
     * 'amount' is the value to convert
     * 'exchangeRate' is the conversion multiplier
     * @return is the converted amount rounded to 2
     * decimal places
     * @throws IllegalArgumentException if any of the 
     * input is null or negative
     */
    public BigDecimal convert(BigDecimal amount, BigDecimal exchangeRate) {
        
        //Logging the current conversion values using SLF4J
        log.info("Conversion request received: amount={}, exchangeRate={}", amount, exchangeRate);

        //if statement to check for null inputs
        if (amount == null || exchangeRate == null) {
            //log an error if any inputs are null
            log.error("Conversion failed: Null value inputs: amount={}, exchangeRate={}", amount, exchangeRate);
            
            throw new IllegalArgumentException("Amount and exchange rate cannot be null");
        }
        //if statement to check for negative values
        if (amount.compareTo(BigDecimal.ZERO) < 0 || exchangeRate.compareTo(BigDecimal.ZERO) < 0) {
            //log a warn when negative values are input
            log.warn("Conversion Rejected: Negative value entered: amount={}, exchangeRate={}", amount, exchangeRate);

            throw new IllegalArgumentException("Amount and exchange rate must be non-negative");
        }
        //Calculate the conversion result and round to 2 decimal places
        BigDecimal convertedAmount = amount.multiply(exchangeRate).setScale(2,RoundingMode.HALF_UP);

        //Log the completed conversion 
        log.info("Conversion completes: convertedAmount{}", convertedAmount);

        return convertedAmount;
    }
}
