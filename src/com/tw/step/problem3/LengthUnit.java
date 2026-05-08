package com.tw.step.problem3;

public enum LengthUnit {
  INCH(2.54),
  FEET(30.48),
  CENTIMETER(1),
  MILLIMETER(0.1);

  public final double factor;

  LengthUnit(double factor) {
    this.factor = factor;
  }
}
