package com.tw.step.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class VolumeTest {
  @Test
  void shouldCompareToTrueWhenGallonEqualToLitre() {
    Volume litre = Volume.create(3.78, VolumeUnit.LITRE);
    Volume gallon = Volume.create(1, VolumeUnit.GALLON);

    assertEquals(litre, gallon);
  }

  @Test
  void shouldCompareToFalseWhenGallonIsNotEqualToLitre() {
    Volume litre = Volume.create(3.78, VolumeUnit.LITRE);
    Volume gallon = Volume.create(2, VolumeUnit.GALLON);

    assertNotEquals(litre, gallon);
  }
}
