package com.tw.step.problem3;

import java.util.Objects;

public class Feet implements Length {
  private final double length;

  private Feet(double length) {
    this.length = length;
  }

  public static Feet create(double length) {
    return new Feet(length);
  }

  @Override
  public boolean same(Length length) {
    Centimeter feetInCentimeter = this.toCentimeter();
    return feetInCentimeter.equals(length.toCentimeter());
  }

  @Override
  public Centimeter toCentimeter() {
    return Centimeter.create(this.length * 2.54 * 12);
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
