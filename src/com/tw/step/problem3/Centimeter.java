package com.tw.step.problem3;

import java.util.Objects;

public class Centimeter {

  private final double length;

  private Centimeter(double length) {
    this.length = length;
  }

  public static Centimeter create(double length) {
    return new Centimeter(length);
  }

  public boolean compareInches(Inches inches) {
    return this.equals(inches.toCentimeter());
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Centimeter that = (Centimeter) o;
    return Double.compare(length, that.length) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(length);
  }
}
