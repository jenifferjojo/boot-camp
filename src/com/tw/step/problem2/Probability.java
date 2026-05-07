package com.tw.step.problem2;

public class Probability {
  private final double sides;
  private final double count;

  public Probability(double sides, double count) {
    this.sides = sides;
    this.count = count;
  }

  public static Probability create(double sides, double count) {
    return new Probability(sides, count);
  }

  public double chanceOfASpecificSide() {
    return 1 / (this.sides * this.count);
  }

  public double chanceOfNotASpecificSide() {
    return 1 - this.chanceOfASpecificSide();
  }
  
}
