package com.tw.step.problem5;

public class Bag {
  private final double capacity;
  private int balls;

  public Bag(double capacity) {
    this.capacity = capacity;
    this.balls = 0;
  }

  public boolean add() {
    if(this.balls >= this.capacity) {
      return  false;
    }

    this.balls++;
    return true;
  }
}
