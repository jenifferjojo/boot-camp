package com.tw.step.problem1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {
  @Test
  void shouldCalculateAreaOfSquare() {
    Square square = Square.create(5.4);
    assertEquals(29.1, square.area(), 0.1);
  }

  @Test
  void shouldCalculatePerimeterOfASquare() {
    Square square = Square.create(3.2);
    assertEquals(12.8, square.perimeter(), 0.1);
  }
}
