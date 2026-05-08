package com.tw.step.problem2;

import com.tw.step.problem2.errors.ImpossibleProbabilityCreationException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ChanceTest {
  @Test
  void shouldReturnChanceOfNotGettingTails() throws ImpossibleProbabilityCreationException {
    Chance chanceOfGettingTails = Chance.create(0.3);
    assertEquals(Chance.create(0.7), chanceOfGettingTails.not());
  }

  @Test
  void shouldReturnChanceOfGettingTailsOnTwoCoins() throws ImpossibleProbabilityCreationException {
    Chance chanceOfGettingTailsOnFirstCoin = Chance.create(0.5);
    Chance chanceOfGettingTailsOnSecondCoin = Chance.create(0.5);
    assertEquals(Chance.create(0.25), chanceOfGettingTailsOnFirstCoin.and(chanceOfGettingTailsOnSecondCoin));
  }

  @Test
  void shouldReturnChanceOfGetting3OnDice() throws ImpossibleProbabilityCreationException {
    Chance chanceOfGettingTailsOnFirstCoin = Chance.create(0.5);
    Chance chanceOfGettingTailsOnSecondCoin = Chance.create(0.5);
    assertEquals(Chance.create(0.75), chanceOfGettingTailsOnFirstCoin.or(chanceOfGettingTailsOnSecondCoin));
  }

  @Test
  void shouldThrowImpossibleProbabilityException() {
    assertThrows(
        ImpossibleProbabilityCreationException.class,
        () -> Chance.create(2)
    );

    assertThrows(
        ImpossibleProbabilityCreationException.class,
        () -> Chance.create(-1)
    );
  }
}
