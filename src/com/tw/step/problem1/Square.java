package com.tw.step.problem1;

public class Square implements Polygon {
  private final Double side;

  public Square(Double side) {
    this.side = side;
  }

  public static Square create(Double side) {
    return new Square(side);
  }

  @Override
  public double area() {
    return this.side * this.side;
  }

  @Override
  public double perimeter() {
    return 4 * this.side;
  }
}
