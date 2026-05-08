package com.tw.step.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CentimeterTest {
  @Test
  void shouldReturnTrueWhenCentimeterIsEqualToInches() {
    Centimeter centimeter = Centimeter.create(5.08);
    Inches inches = Inches.create(2);

    assertTrue(centimeter.same(inches));
  }

  @Test
  void shouldReturnFalseWhenCentimeterIsNotEqualToInches() {
    Centimeter centimeter = Centimeter.create(5);
    Inches inches = Inches.create(3);

    assertFalse(centimeter.same(inches));
  }

  @Test
  void shouldReturnTrueWhenCentimeterIsEqualToFeet() {
    Centimeter centimeter = Centimeter.create(30.48);
    Feet feet = Feet.create(1);

    assertTrue(centimeter.same(feet));
  }

  @Test
  void shouldReturnFalseWhenCentimeterIsNotEqualToFeet() {
    Centimeter centimeter = Centimeter.create(30.48);
    Feet feet = Feet.create(2);

    assertFalse(centimeter.same(feet));
  }
}
