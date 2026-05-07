package com.tw.step.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProbabilityTest {
  @Test
  void shouldReturnTailProbabilityOfACoin() {
    Probability probability = Probability.create(2, 1);
    assertEquals(0.5, probability.chanceOfASpecificSide());
  }

  @Test
  void shouldReturnNotATailProbabilityOfACoin() {
    Probability probability = Probability.create(2, 1);
    assertEquals(0.5, probability.chanceOfNotASpecificSide());
  }

  @Test
  void shouldReturnTailProbabilityOf2Coin() {
    Probability probability = Probability.create(2, 2);
    assertEquals(0.25, probability.chanceOfASpecificSide());
  }

  @Test
  void shouldReturnProbabilityOfGetting3InADice() {
    Probability probability = Probability.create(6, 1);
    assertEquals(0.166, probability.chanceOfASpecificSide(), 0.01);
  }
}
