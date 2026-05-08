package com.tw.step.problem3;

import java.util.Objects;

public class MilliMeter implements Length{
  private final double length;

  public MilliMeter(double length) {
    this.length = length;
  }

  @Override
  public Centimeter toCentimeter() {
    return Centimeter.create(this.length / 10);
  }
}
