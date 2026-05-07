package com.tw.step.problem1;

public class Square {
  private final Double side;

  public Square(Double side) {
    this.side = side;
  }

  public static Square create(Double side) {
    return new Square(side);
  }

  public double area() {
    return this.side * this.side;
  }

  public double perimeter() {
    return 4 * this.side;
  }
}
