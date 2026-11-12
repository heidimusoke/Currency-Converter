package com.currencyconverter.service;

import java.math.BigDecimal;
import org.junit.jupiter.api.Tag;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

@Tag("unit")
public class CurrencyConverterNullInputsTest {

    private final CurrencyConverterService service = new CurrencyConverterService();

    @Test
    void testNullInputsThrowException() {
        assertThrows(IllegalArgumentException.class, () -> service.convert(null, new BigDecimal("1.15")));
        assertThrows(IllegalArgumentException.class, () -> service.convert(new BigDecimal("100.00"), null));
    }
}