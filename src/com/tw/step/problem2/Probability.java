package com.tw.step.problem2;

public class Probability {
  private final double sides;

  public Probability(double sides) {
    this.sides = sides;
  }

  public double chanceOfSingleSide() {
    return 1 / this.sides;
  }

  public double chanceOfNotASpecificSide() {
    return 1 - this.chanceOfSingleSide();
  }
}
