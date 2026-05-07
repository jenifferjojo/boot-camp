package com.tw.step.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CoinTest {

  @Test
  void shouldReturnTheChanceOfGettingTailsWhenFlippingACoin() {
    Coin coin = Coin.create(0.3, 0.7);
    assertEquals(0.3, coin.tailProbability());
  }
}
