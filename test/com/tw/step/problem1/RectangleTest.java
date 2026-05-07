package com.tw.step.problem1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
  @Test
  void shouldCalculateAreaOfRectangle() {
    Rectangle rectangle = Rectangle.createRectangle(3, 4);
    assertEquals(12, rectangle.area());
  }

  @Test
  void shouldCalculateRectangleAreaForDecimals() {
    Rectangle rectangle = Rectangle.createRectangle(3.5, 6.2);
    assertEquals(21.7, rectangle.area());
  }

  @Test
  void shouldCalculatePerimeterOfTheRectangle() {
    Rectangle rectangle = Rectangle.createRectangle(3, 5);
    assertEquals(16, rectangle.perimeter());
  }

  @Test
  void shouldCalculatePerimeterOfTheRectangleInDecimalPoints() {
    Rectangle rectangle = Rectangle.createRectangle(3.2, 5.5);
    assertEquals(17.4, rectangle.perimeter());
  }

  @Test
  void shouldCalculateSquareArea() {
    Rectangle square = Rectangle.createSquare(3.5);
    assertEquals(12.25, square.area());
  }

  @Test
  void shouldCalculateSquarePerimeter() {
    Rectangle square = Rectangle.createSquare(3.5);
    assertEquals(14, square.perimeter());
  }
}