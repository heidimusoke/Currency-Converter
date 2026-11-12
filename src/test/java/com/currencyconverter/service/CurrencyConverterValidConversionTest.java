package com.currencyconverter.service;

import java.math.BigDecimal;
import org.junit.jupiter.api.Tag;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

@Tag("unit")
public class CurrencyConverterValidConversionTest{

    private final CurrencyConverterService service = new CurrencyConverterService();

    @Test
    void testValidConversion() {
            BigDecimal amount = new BigDecimal("100.00");
            BigDecimal rate = new BigDecimal("1.15");
            BigDecimal result = service.convert(amount, rate);

            assertEquals(new BigDecimal("115.00"), result);
        }
}
