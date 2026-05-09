package com.tw.step.problem5;

import java.util.HashMap;
import java.util.Map;

public class Bag {
  private final Map<Ball, Integer> bag;
  private double currentCapacity;
  private final double capacity;

  public Bag(double capacity) {
    this.capacity = capacity;
    this.currentCapacity = capacity;
    this.bag = new HashMap<>();
  }

  public boolean add(Ball color) {
    if(this.currentCapacity == 0) {
      return  false;
    }

    if(this.bag.getOrDefault(Ball.GREEN, 0) >= 3 && color == Ball.GREEN) {
      return false;
    }

    if(this.bag.getOrDefault(Ball.GREEN, 0) == 2 * this.bag.getOrDefault(Ball.RED, 0) && color == Ball.RED) {
      return false;
    }

    this.currentCapacity--;
    this.bag.put(color, this.bag.getOrDefault(color, 0) + 1);
    return true;
  }
}
