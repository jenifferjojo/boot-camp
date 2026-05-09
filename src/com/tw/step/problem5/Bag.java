package com.tw.step.problem5;

import java.util.HashMap;
import java.util.Map;

public class Bag {
  private double currentCapacity;
  private final double capacity;
  private final Map<Ball, Integer> balls;

  public Bag(double capacity) {
    this.capacity = capacity;
    this.currentCapacity = capacity;
    this.balls = new HashMap<>();
  }

  public boolean add(Ball color) {
    if(this.currentCapacity == 0) {
      return  false;
    }

    if(this.balls.getOrDefault(Ball.GREEN, 0) >= 3 && color == Ball.GREEN) {
      return false;
    }

    this.currentCapacity--;
    this.balls.put(color, this.balls.getOrDefault(color, 0) + 1);
    return true;
  }
}
