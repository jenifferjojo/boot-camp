package com.tw.step.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LitreTest {
  @Test
  void shouldReturnTrueWhenLitreEqualsGallon() {
    Litre litre = Litre.create(3.78);
    Gallon gallon = Gallon.create(1);

    assertTrue(litre.same(gallon));
  }

  @Test
  void shouldReturnFalseWhenLitreNotEqualsGallon() {
    Litre litre = Litre.create(3.78);
    Gallon gallon = Gallon.create(2);

    assertFalse(litre.same(gallon));
  }
}
