package com.tw.step.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProbabilityTest {
  @Test
  void shouldReturnTailProbabilityOfACoin() {
    Probability probability = Probability.create(2, 1);
    assertEquals(0.5, probability.chanceOfSingleSide());
  }

  @Test
  void shouldReturnNotATailProbabilityOfACoin() {
    Probability probability = Probability.create(2, 1);
    assertEquals(0.5, probability.chanceOfNotASpecificSide());
  }

  @Test
  void shouldReturnTailProbabilityOf2Coin() {
    Probability probability = Probability.create(2, 2);
    assertEquals(0.25, probability.chanceOfSameSide());
  }
}
