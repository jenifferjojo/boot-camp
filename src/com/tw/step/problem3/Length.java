package com.tw.step.problem3;

public interface Length {
  default boolean same(Length length) {
    Centimeter centimeter = this.toCentimeter();
    return centimeter.equals(length.toCentimeter());
  }

  Centimeter toCentimeter();
}
