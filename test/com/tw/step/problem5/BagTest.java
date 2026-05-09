package com.tw.step.problem5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

  @Test
  void shouldAddYellowBallsIfTheBagContainsLessThan40PercentYellowOfTotal() {
    Bag bag = new Bag(5);

    bag.add(Ball.RED);
    bag.add(Ball.BLUE);
    bag.add(Ball.GREEN);

    assertTrue(bag.add(Ball.YELLOW));
  }

  @Test
  void shouldNotAddYellowBallsIfTheBagContainsMoreThanOrEqualTo40PercentYellowOfTotal() {
    Bag bag = new Bag(10);

    bag.add(Ball.GREEN);
    bag.add(Ball.GREEN);
    bag.add(Ball.GREEN);
    bag.add(Ball.YELLOW);

    assertFalse(bag.add(Ball.YELLOW));
  }

  @Test
  void shouldReturnTheCountOfSingleBallWithCountInTheBag() {
    Bag bag = new Bag(5);

    bag.add(Ball.BLUE);

    String expected =
        """
           BLUE : 1
           
           TOTAL : 1""";

    assertEquals(expected, bag.display());
  }

  @Test
  void shouldReturnTheCountOfEachBallWithCountInTheBag() {
    Bag bag = new Bag(5);

    bag.add(Ball.BLUE);
    bag.add(Ball.GREEN);
    bag.add(Ball.RED);
    bag.add(Ball.YELLOW);

    String expected =
        """
           BLUE : 1
           GREEN : 1
           RED : 1
           YELLOW : 1
           
           TOTAL : 4""";

    assertEquals(expected, bag.display());
  }
}
