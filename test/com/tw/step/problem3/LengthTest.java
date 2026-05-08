package com.tw.step.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LengthTest {
  @Test
  void shouldCompareToTrueWhenFeetEqualToCentimeter() {
    Length feet = Length.create(1, LengthUnit.FEET);
    Length centimeter = Length.create(30.48, LengthUnit.CENTIMETER);

    assertTrue(feet.sameAs(centimeter));
  }

  @Test
  void shouldCompareToFalseWhenFeetIsNotEqualToCentimeter() {
    Length feet = Length.create(2, LengthUnit.FEET);
    Length centimeter = Length.create(30.48, LengthUnit.CENTIMETER);

    assertFalse(feet.sameAs(centimeter));
  }

  @Test
  void shouldCompareToTrueWhenCentimeterEqualToMillimeter() {
    Length mm = Length.create(10, LengthUnit.MILLIMETER);
    Length centimeter = Length.create(1, LengthUnit.CENTIMETER);

    assertTrue(mm.sameAs(centimeter));
  }

  @Test
  void shouldCompareToFalseWhenCentimeterIsNotEqualToMillimeter() {
    Length mm = Length.create(10, LengthUnit.MILLIMETER);
    Length centimeter = Length.create(2, LengthUnit.CENTIMETER);

    assertFalse(mm.sameAs(centimeter));
  }

  @Test
  void shouldCompareToTrueWhenCentimeterEqualToInches() {
    Length inches = Length.create(1, LengthUnit.INCH);
    Length centimeter = Length.create(2.54, LengthUnit.CENTIMETER);

    assertTrue(inches.sameAs(centimeter));
  }

  @Test
  void shouldCompareToFalseWhenCentimeterIsNotEqualToInches() {
    Length inches = Length.create(1.5, LengthUnit.INCH);
    Length centimeter = Length.create(2.54, LengthUnit.CENTIMETER);

    assertFalse(inches.sameAs(centimeter));
  }

  @Test
  void shouldCompareToTrueWhenFeetEqualToInches() {
    Length inches = Length.create(12, LengthUnit.INCH);
    Length feet = Length.create(1, LengthUnit.FEET);

    assertTrue(feet.sameAs(inches));
  }

  @Test
  void shouldCompareToFalseWhenFeetIsNotEqualToInches() {
    Length inches = Length.create(12, LengthUnit.INCH);
    Length feet = Length.create(1.5, LengthUnit.FEET);

    assertFalse(feet.sameAs(inches));
  }

  @Test
  void shouldReturnTheSumOfLengthOfInches() {
    Length length1 = Length.create(2, LengthUnit.INCH);
    Length length2 = Length.create(2, LengthUnit.INCH);
    Length sum = length1.add(length2);

    assertEquals(Length.create(4, LengthUnit.INCH), sum);
  }

  @Test
  void shouldReturnTheSumOfCentimeterAndInchesInInches() {
    Length cm = Length.create(2.54, LengthUnit.CENTIMETER);
    Length inches = Length.create(2, LengthUnit.INCH);

    Length sum = inches.add(cm);

    assertEquals(Length.create(3, LengthUnit.INCH), sum);
  }

  @Test
  void shouldReturnTheSumOfCentimeterAndFeetInInches() {
    Length cm = Length.create(2.54, LengthUnit.CENTIMETER);
    Length feet = Length.create(1, LengthUnit.FEET);

    Length sum = feet.add(cm);

    assertEquals(Length.create(13, LengthUnit.INCH), sum);
  }

  @Test
  void shouldReturnTheSumOfInchesAndFeetInInches() {
    Length inches = Length.create(1, LengthUnit.INCH);
    Length feet = Length.create(1, LengthUnit.FEET);

    Length sum = feet.add(inches);

    assertEquals(Length.create(13, LengthUnit.INCH), sum);
  }
}
