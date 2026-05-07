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

  public Chance getChance() {
    return this;
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

  public Chance notGetChance() {
    return Chance.create(1 - this.chance);
  }
}
