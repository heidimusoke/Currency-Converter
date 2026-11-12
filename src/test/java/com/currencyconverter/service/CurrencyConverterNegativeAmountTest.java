package com.currencyconverter.service;

import java.math.BigDecimal;
import org.junit.jupiter.api.Tag;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

@Tag("unit")
public class CurrencyConverterNegativeAmountTest{
    
    private final CurrencyConverterService service = new CurrencyConverterService();

    @Test
    void testNegativeAmountThrowsException() {
        BigDecimal amount = new BigDecimal("-50.00");
        BigDecimal rate = new BigDecimal("1.15");

        assertThrows(IllegalArgumentException.class, () -> service.convert(amount, rate));
    }
}
