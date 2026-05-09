package com.tw.step.problem5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BagTest {
  @Test
  void shouldAddBallsToABagIfTheBagHasLessThanCapacity() {
    Bag bag = new Bag(12);

    assertTrue(bag.add(Ball.GREEN));
  }

  @Test
  void shouldNotAddBallsToABagIfTheBagHasMoreThanOrEqualToCapacity() {
    Bag bag = new Bag(1);

    bag.add(Ball.RED);
    assertFalse(bag.add(Ball.RED));
  }

  @Test
  void shouldNotAllowAddingMoreGreenBallsIfTheBagAlreadyHas3GreenBall() {
    Bag bag = new Bag(5);

    bag.add(Ball.GREEN);
    bag.add(Ball.GREEN);
    bag.add(Ball.GREEN);

    assertFalse(bag.add(Ball.GREEN));
  }

  @Test
  void shouldAddRedBallsIfTheBagContainsLessRedBallsThanTheDoubleOfGreen() {
    Bag bag = new Bag(5);
    bag.add(Ball.GREEN);

    assertTrue(bag.add(Ball.RED));
  }

  @Test
  void shouldNotAddRedBallsIfTheBagContainsMoreRedBallsThanTheDoubleOfGreen() {
    Bag bag = new Bag(5);

    assertFalse(bag.add(Ball.RED));
  }
}
