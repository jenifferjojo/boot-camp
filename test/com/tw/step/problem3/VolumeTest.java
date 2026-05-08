package com.tw.step.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VolumeTest {
  @Test
  void shouldCompareToTrueWhenGallonEqualToLitre() {
    Volume litre = Volume.create(3.78, VolumeUnit.LITRE);
    Volume gallon = Volume.create(1, VolumeUnit.GALLON);

    assertTrue(litre.sameAs(gallon));
  }

  @Test
  void shouldCompareToFalseWhenGallonIsNotEqualToLitre() {
    Volume litre = Volume.create(3.78, VolumeUnit.LITRE);
    Volume gallon = Volume.create(2, VolumeUnit.GALLON);

    assertFalse(litre.sameAs(gallon));
  }

  @Test
  void shouldReturnSumOfLitresAndGallonInLitres() {
    Volume litre = Volume.create(3.78, VolumeUnit.LITRE);
    Volume gallon = Volume.create(1, VolumeUnit.GALLON);

    Volume sum = litre.add(gallon);

    assertEquals(Volume.create(7.56, VolumeUnit.LITRE), sum);
  }
}
