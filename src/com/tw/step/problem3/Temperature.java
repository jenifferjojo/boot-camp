package com.tw.step.problem3;

import java.util.Objects;

public class Temperature {
  private final double value;
  private final TemperatureUnit unit;

  public Temperature(double value, TemperatureUnit unit) {
    this.value = value;
    this.unit = unit;
  }

  public static Temperature create(double value, TemperatureUnit unit) {
    return new Temperature(value, unit);
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Temperature that = (Temperature) o;
    double c1 = this.unit.convert.applyAsDouble(this.value);
    double c2 = that.unit.convert.applyAsDouble(that.value);
    return Double.compare(c1, c2) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, unit);
  }
}
