package com.tw.step.problem1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
  @Test
  void shouldCalculateAreaOfRectangle() {
    Rectangle rectangle = Rectangle.create(3, 4);
    assertEquals(12, rectangle.area());
  }

  @Test
  void shouldCalculateAreaForDecimals() {
    Rectangle rectangle = Rectangle.create(3.5, 6.2);
    assertEquals(21.7, rectangle.area());
  }
}