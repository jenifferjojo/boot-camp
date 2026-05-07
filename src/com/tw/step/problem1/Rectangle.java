package com.tw.step.problem1;

public class Rectangle implements Polygon {
  private final double width;
  private final double height;

  private Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  public static Rectangle create(double width, double height) {
    return new Rectangle(width, height);
  }

  @Override
  public double area() {
    return this.width * this.height;
  }

  @Override
  public double perimeter() {
    return 2 * (this.width + this.height);
  }
}
