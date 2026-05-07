package com.tw.step.problem2;

import java.util.Objects;

public class Chance {
  private final double chance;

  public Chance(double chance) {
    this.chance = chance;
  }

  public static Chance create(double chance) {
    return new Chance(chance);
  }

  public Chance unlikelihood() {
    return Chance.create(1 - this.chance);
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Chance that = (Chance) o;
    return Double.compare(chance, that.chance) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(chance);
  }

  public Chance and(Chance chanceOfGettingTailsOnFirstCoin) {
    return Chance.create(chanceOfGettingTailsOnFirstCoin.chance * this.chance);
  }

  public Chance or(Chance chanceOfGettingTailsOnFirstCoin) {
    double totalProbability = chanceOfGettingTailsOnFirstCoin.chance + this.chance;
    double complement = this.and(chanceOfGettingTailsOnFirstCoin).chance;
    return Chance.create(totalProbability - complement);
  }
}
