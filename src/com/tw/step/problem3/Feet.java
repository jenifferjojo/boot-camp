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

  public boolean same(Inches inches) {
    Inches feetInInches = this.convertToInches();
    return inches.equals(feetInInches);
  }

  private Inches convertToInches() {
    return Inches.create(this.length * 12);
  }
}
