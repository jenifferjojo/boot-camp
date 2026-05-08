package com.tw.step.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InchTest {
  @Test
  void shouldCreateLengthInInches() {
    Inches inches = Inches.create(10);
    assertEquals(Inches.create(10), inches);
  }
}
