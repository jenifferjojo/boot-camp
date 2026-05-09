package com.tw.step.problem5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BagTest {
  @Test
  void shouldAddBallsToABagIfTheBagHasLessThanCapacity() {
    Bag bag = new Bag(12);

    assertTrue(bag.add());
  }

  @Test
  void shouldNotAddBallsToABagIfTheBagHasMoreThanOrEqualToCapacity() {
    Bag bag = new Bag(1);

    bag.add();
    assertFalse(bag.add());
  }
}
