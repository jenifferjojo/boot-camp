package com.tw.step.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GallonTest {
  @Test
  void shouldReturnTrueWhenGallonIsEqualToLitre() {
    Litre litre = Litre.create(3.78);
    Gallon gallon = Gallon.create(1);

    assertTrue(gallon.same(litre));
  }

  @Test
  void shouldReturnFalseWhenGallonIsNotEqualToLitre() {
    Litre litre = Litre.create(3.78);
    Gallon gallon = Gallon.create(2);

    assertFalse(gallon.same(litre));
  }
}
