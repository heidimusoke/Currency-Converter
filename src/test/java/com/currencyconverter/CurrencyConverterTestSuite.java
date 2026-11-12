package com.currencyconverter;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import com.currencyconverter.service.CurrencyConverterNegativeAmountTest;
import com.currencyconverter.service.CurrencyConverterNullInputsTest;
import com.currencyconverter.service.CurrencyConverterValidConversionTest;

@Suite
@SelectClasses({
    CurrencyConverterValidConversionTest.class,
    CurrencyConverterNegativeAmountTest.class,
    CurrencyConverterNullInputsTest.class
})
public class CurrencyConverterTestSuite {
}