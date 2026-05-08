package com.tw.step.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InchTest {
  @Test
  void shouldCreateCentimeterEquivalent() {
    Inches inches = Inches.create(1);
    assertEquals(Centimeter.create(2.54), inches.toCentimeter());
  }

  @Test
  void shouldReturnTrueWhenInchIsEqualToCentimeter() {
    Inches inches = Inches.create(1);
    Centimeter centimeter = Centimeter.create(2.54);

    assertTrue(inches.same(centimeter));
  }

  @Test
  void shouldReturnTrueWhenInchIsEqualToFeet() {
    Inches inches = Inches.create(12);
    Feet feet = Feet.create(1);

    assertTrue(inches.same(feet));
  }

  @Test
  void shouldReturnFalseWhenInchIsNotEqualToFeet() {
    Inches inches = Inches.create(12);
    Feet feet = Feet.create(2);

    assertFalse(inches.same(feet));
  }

  @Test
  void shouldReturnFalseWhenInchIsEqualToCentimeter() {
    Inches inches = Inches.create(1);
    Centimeter centimeter = Centimeter.create(5);

    assertFalse(inches.same(centimeter));
  }
}
