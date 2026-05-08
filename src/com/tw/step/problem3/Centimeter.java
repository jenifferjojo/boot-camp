package com.tw.step.problem3;

import java.util.Objects;

public class Centimeter implements Length{

  private final double length;

  private Centimeter(double length) {
    this.length = length;
  }

  public static Centimeter create(double length) {
    return new Centimeter(length);
  }

  @Override
  public boolean same(Length length) {
    return this.equals(length.toCentimeter());
  }

  @Override
  public Centimeter toCentimeter() {
    return this;
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
