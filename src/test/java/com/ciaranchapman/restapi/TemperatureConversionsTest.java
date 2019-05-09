package com.ciaranchapman.restapi;

import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class TemperatureConversionsTest
{

    @Test
    public void getTemperatureConversionCelisusToFahrenheit() throws Exception
    {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal celsiusToFahrenheitResult = service.celsiusToFahrenheit(BigDecimal.valueOf(0.0));
        assertEquals("The Celsius to Fahrenheit Conversion Failed!", celsiusToFahrenheitResult, BigDecimal.valueOf(32));
    }

    @Test
    public void getTemperatureConversionFahrenheitToCelsius() throws Exception
    {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal FahrenheitToCelsiusResult = service.fahrenheitToCelsius(BigDecimal.valueOf(32.0));
        assertEquals("The Fahrenheit To Celsius Conversion Failed!", FahrenheitToCelsiusResult, BigDecimal.valueOf(0));
    }

    @Test
    public void getTemperatureConversionWindChillInFahrenheit() throws Exception
    {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal windChillInFahrenheit = service.windChillInFahrenheit(BigDecimal.valueOf(32.0), BigDecimal.valueOf(10.0));
        assertEquals("The Wind Chill In Fahrenheit Conversion Failed!", windChillInFahrenheit, BigDecimal.valueOf(15.854));
    }

    @Test
    public void getTemperatureConversionWindChillInCelsius() throws Exception
    {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal windChillInCelsius = service.windChillInCelsius(BigDecimal.valueOf(0.0), BigDecimal.valueOf(10.0));
        assertEquals("The Wind Chill In Fahrenheit Conversion Failed!", windChillInCelsius, BigDecimal.valueOf(-8.97));
    }
}