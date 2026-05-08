package com.tw.step.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FeetTest {
  @Test
  void shouldReturnTrueWhenInchesIsEqualToFeet() {
    Feet feet = Feet.create(1);
    Inches inches = Inches.create(12);

    assertTrue(feet.same(inches));
  }

  @Test
  void shouldReturnFalseWhenInchesIsNotEqualToFeet() {
    Feet feet = Feet.create(1);
    Inches inches = Inches.create(10);

    assertFalse(feet.same(inches));
  }

  @Test
  void shouldReturnTrueWhenFeetIsEqualToCentimeter() {
    Feet feet = Feet.create(1);
    Centimeter centimeter = Centimeter.create(30.48);

    assertTrue(feet.same(centimeter));
  }

  @Test
  void shouldReturnFalseWhenFeetIsNotEqualToCentimeter() {
    Feet feet = Feet.create(1);
    Centimeter centimeter = Centimeter.create(10);

    assertFalse(feet.same(centimeter));
  }
}
