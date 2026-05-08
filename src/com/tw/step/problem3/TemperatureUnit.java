package com.tw.step.problem3;

import java.util.function.DoubleUnaryOperator;

public enum TemperatureUnit {
  CELSIUS((c) -> c),
  FAHRENHEIT((f) -> (f - 32) * 5/9);

  public final DoubleUnaryOperator convert;

  TemperatureUnit(DoubleUnaryOperator operator) {
    this.convert = operator;
  }
}
