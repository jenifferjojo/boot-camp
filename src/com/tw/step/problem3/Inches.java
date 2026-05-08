package com.tw.step.problem3;

import java.util.Objects;

public class Inches {

  private final double length;

  private Inches(double length) {
    this.length = length;
  }

  public static Inches create(double length) {
    return new Inches(length);
  }

  public Centimeter toCentimeter() {
    return Centimeter.create(this.length * 2.5);
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Inches inches = (Inches) o;
    return Double.compare(length, inches.length) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(length);
  }
}
