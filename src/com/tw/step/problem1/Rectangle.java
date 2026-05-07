package com.tw.step.problem1;

public class Rectangle {
  private final int width;
  private final int height;

  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  public int area() {
    return this.width * this.height;
  }
}
