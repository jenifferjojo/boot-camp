package com.tw.step.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChanceTest {
  @Test
  void shouldReturnTailProbabilityOfACoin() {
    Chance chance = Chance.create(0.3);
    assertEquals(Chance.create(0.3), chance.getChance());
  }

  @Test
  void shouldReturnNotProbability() {
    Chance chance = Chance.create(0.3);
    assertEquals(Chance.create(0.7), chance.notGetChance());
  }
}
