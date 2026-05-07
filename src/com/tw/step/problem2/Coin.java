package com.tw.step.problem2;

public class Coin {
  private final double headProbability;
  private final double tailProbability;

  public Coin(double headProbability, double tailProbability) {
    this.headProbability = headProbability;
    this.tailProbability = tailProbability;
  }

  public static Coin create(double tailProbability, double headProbability) {
    return new Coin(headProbability, tailProbability);
  }

  public double tailProbability() {
    return tailProbability;
  }
}
