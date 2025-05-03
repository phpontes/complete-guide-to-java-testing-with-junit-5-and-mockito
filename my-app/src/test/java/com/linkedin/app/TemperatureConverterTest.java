package com.linkedin.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class TemperatureConverterTest {

  @ParameterizedTest
  @CsvSource({
    "0, 32.0",
    "100, 212.0",
    "-40, -40.0",
    "37, 98.6",
    "25, 77.0",
    "-10, 14.0"
  })
  void celsiusToFahrenheit(int celsius, double expectedFahrenheit) {
    assertEquals(expectedFahrenheit, TemperatureConverter.celsiusToFahrenheit(celsius));
  }
}