package com.tw.step.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChanceTest {
  @Test
  void shouldReturnChanceOfNotGettingTails() {
    Chance chanceOfNotGettingTails = Chance.create(0.3);
    assertEquals(Chance.create(0.7), chanceOfNotGettingTails.unlikelihood());
  }

  @Test
  void shouldReturnChanceOfNotGettingTailsOnTwoCoins() {
    Chance chanceOfGettingTailsOnFirstCoin = Chance.create(0.5);
    Chance chanceOfGettingTailsOnSecondCoin = Chance.create(0.5);
    assertEquals(Chance.create(0.25), chanceOfGettingTailsOnFirstCoin.and(chanceOfGettingTailsOnSecondCoin));
  }
}
