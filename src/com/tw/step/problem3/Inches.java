package com.tw.step.problem3;

public class Inches implements Length {

  private final double length;

  private Inches(double length) {
    this.length = length;
  }

  public static Inches create(double length) {
    return new Inches(length);
  }

  @Override
  public Centimeter toCentimeter() {
    return Centimeter.create(this.length * 2.54);
  }
}
