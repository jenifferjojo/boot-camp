package com.tw.step.problem3;

import com.tw.step.problem3.error.IllegalLengthCreationException;

import java.util.Objects;

public class Length {
  private final double value;
  private final LengthUnit unit;

  private Length(double value, LengthUnit unit) {
    this.value = value;
    this.unit = unit;
  }

  static Length create(double value, LengthUnit unit) throws IllegalLengthCreationException{
    if(value < 0) {
      throw new IllegalLengthCreationException("Length has to be a whole number");
    }

    return new Length(value, unit);
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Length length = (Length) o;
    return value - length.value < 0.000001 && unit == length.unit;
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, unit);
  }

  public Length add(Length that) throws IllegalLengthCreationException {
    double thisInCentimeter = this.value * this.unit.factor;
    double thatInCentimeter = that.value * that.unit.factor;
    double sumInInches = (thisInCentimeter + thatInCentimeter) / LengthUnit.INCH.factor;

    return Length.create(sumInInches, LengthUnit.INCH);
  }

  public boolean sameAs(Length length) {
    return Double.compare(value * this.unit.factor, length.value * length.unit.factor) == 0;
  }
}
