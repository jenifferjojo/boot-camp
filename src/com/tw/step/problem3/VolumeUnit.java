package com.tw.step.problem3;

public enum VolumeUnit {
  LITRE(1), GALLON(3.78);

  public final double factor;

  VolumeUnit(double factor) {
    this.factor = factor;
  }
}
