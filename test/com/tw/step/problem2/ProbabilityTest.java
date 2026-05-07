package com.tw.step.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProbabilityTest {
  @Test
  void shouldReturnTailProbabilityOfACoin() {
    Probability probability = new Probability(2);
    assertEquals(0.5, probability.chanceOfSingleSide());
  }

  @Test
  void shouldReturnNotATailProbabilityOfACoin() {
    Probability probability = new Probability(2);
    assertEquals(0.5, probability.chanceOfNotASpecificSide());
  }
}
