package com.tw.step.problem5;

import java.util.HashMap;
import java.util.Map;

public class Bag {
  private final Map<Ball, Integer> bag;
  private double taken;
  private final double capacity;

  public Bag(double capacity) {
    this.capacity = capacity;
    this.taken = 0;
    this.bag = new HashMap<>();
  }

  public boolean add(Ball color) {
    if(this.taken == 12) {
      return  false;
    }

    if (isColorFilled(color)) return false;

    this.taken++;
    this.bag.put(color, this.bag.getOrDefault(color, 0) + 1);
    return true;
  }

  private boolean isColorFilled(Ball color) {
    Integer count = this.bag.getOrDefault(color, 0);
    if(color == Ball.GREEN) {
      return count >= 3 ;
    }

    if(color == Ball.RED) {
      return this.bag.getOrDefault(Ball.GREEN, 0) == 2 * count;
    }

    if (color == Ball.YELLOW) {
      return (count / this.taken * 100) >= 40;
    }
    return false;
  }
}
