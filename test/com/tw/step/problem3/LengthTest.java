package com.tw.step.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LengthTest {
  @Test
  void shouldCompareToTrueWhenFeetEqualToCentimeter() {
    Length feet = Length.create(1, LengthUnit.FEET);
    Length centimeter = Length.create(30.48, LengthUnit.CENTIMETER);

    assertEquals(feet, centimeter);
  }

  @Test
  void shouldCompareToTrueWhenCentimeterEqualToMillimeter() {
    Length mm = Length.create(10, LengthUnit.MILLIMETER);
    Length centimeter = Length.create(1, LengthUnit.CENTIMETER);

    assertEquals(mm, centimeter);
  }

  @Test
  void shouldCompareToTrueWhenCentimeterEqualToInches() {
    Length inches = Length.create(1, LengthUnit.INCH);
    Length centimeter = Length.create(2.54, LengthUnit.CENTIMETER);

    assertEquals(inches, centimeter);
  }

  @Test
  void shouldCompareToTrueWhenFeetEqualToInches() {
    Length inches = Length.create(12, LengthUnit.INCH);
    Length feet = Length.create(1, LengthUnit.FEET);

    assertEquals(inches, feet);
  }
}
