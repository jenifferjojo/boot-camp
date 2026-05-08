package com.tw.step.problem3;

import java.util.Objects;

public class Feet {
  private final double length;

  private Feet(double length) {
    this.length = length;
  }

  public static Feet create(double length) {
    return new Feet(length);
  }

  public boolean compareInches(Inches inches) {
    Centimeter feetInCentimeter = this.toCentimeter();
    return feetInCentimeter.equals(inches.toCentimeter());
  }

  private Centimeter toCentimeter() {
    return Centimeter.create(this.length * 2.5 * 12);
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Feet feet = (Feet) o;
    return Double.compare(length, feet.length) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(length);
  }
}
