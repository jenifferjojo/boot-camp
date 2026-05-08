package com.tw.step.problem3;

import java.util.Objects;

public class Length {
  private final double value;
  private final LengthUnit unit;

  public Length(double value, LengthUnit unit) {
    this.value = value;
    this.unit = unit;
  }

  static Length create(double value, LengthUnit unit) {
    return new Length(value, unit);
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Length length = (Length) o;
    return Double.compare(value * this.unit.factor, length.value * length.unit.factor) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, unit);
  }

  public Length add(Length that) {
    return Length.create(this.value + that.value, this.unit);
  }
}
