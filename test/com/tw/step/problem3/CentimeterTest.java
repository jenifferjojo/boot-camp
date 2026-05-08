package com.tw.step.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CentimeterTest {
  @Test
  void shouldCompareCentimeterWithInches() {
    Centimeter centimeter = Centimeter.create(5);
    Inches inches = Inches.create(2);

    assertTrue(centimeter.compareInches(inches));
  }
}
