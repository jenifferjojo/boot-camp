package com.tw.step.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthTest {
  @Test
  void shouldCreateLengthWithUnitInches() {
    Length inches = Length.create(12, LengthUnit.INCH);
    Length feet = Length.create(1, LengthUnit.FEET);
    assertEquals(inches, feet);
  }

  @Test
  void shouldCreateLengthWithUnitFeet() {
    Length inches = Length.create(1, LengthUnit.FEET);
    Length centimeter = Length.create(30.48, LengthUnit.CENTIMETER);
    assertEquals(inches, centimeter);
  }

  @Test
  void shouldCreateLengthWithUnitMM() {
    Length mm = Length.create(10, LengthUnit.MILLIMETER);
    Length centimeter = Length.create(1, LengthUnit.CENTIMETER);
    assertEquals(mm, centimeter);
  }
}
