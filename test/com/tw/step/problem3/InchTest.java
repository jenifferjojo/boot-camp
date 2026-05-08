package com.tw.step.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InchTest {
  @Test
  void shouldCreateLengthInInches() {
    Inches inches = Inches.create(10);
    assertEquals(Inches.create(10), inches);
  }

  @Test
  void shouldCreateCentimeterEquivalent() {
    Inches inches = Inches.create(1);
    assertEquals(Centimeter.create(2.5), inches.toCentimeter());
  }
}
