package com.tw.step.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FeetTest {
  @Test
  void shouldCreateLengthInFeet() {
    Feet feet = Feet.create(10);
    assertEquals(Feet.create(10), feet);
  }

  @Test
  void shouldReturnTrueWhenInchesIsEqualToFeet() {
    Feet feet = Feet.create(1);
    Inches inches = Inches.create(12);
    assertTrue(feet.compareInches(inches));
  }
}
