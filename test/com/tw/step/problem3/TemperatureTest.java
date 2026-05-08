package com.tw.step.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureTest {
  @Test
  void shouldCompareFahrenheitAndCelsius() {
    Temperature celsius = Temperature.create(100, TemperatureUnit.CELSIUS);
    Temperature fahrenheit = Temperature.create(212, TemperatureUnit.FAHRENHEIT);

    assertEquals(celsius, fahrenheit);
  }
}
