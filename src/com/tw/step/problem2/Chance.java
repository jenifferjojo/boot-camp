package com.tw.step.problem2;

import com.tw.step.problem2.errors.ImpossibleProbabilityCreationException;

import java.util.Objects;

public class Chance {
  private final double chance;

  public Chance(double chance) {
    this.chance = chance;
  }

  public static Chance create(double chance) throws ImpossibleProbabilityCreationException {
    if (chance < 0 || chance > 1) {
      throw new ImpossibleProbabilityCreationException("probability should be between 0 and 1");
    }
    return new Chance(chance);
  }

  public Chance not() throws ImpossibleProbabilityCreationException {
    return Chance.create(1 - this.chance);
  }

  public Chance and(Chance that) throws ImpossibleProbabilityCreationException {
    return Chance.create(that.chance * this.chance);
  }
  
  public Chance or(Chance that) throws ImpossibleProbabilityCreationException {
    Chance notOfThat = that.not();
    Chance notOfThis = this.not();
    Chance intersection = notOfThis.and(notOfThat);
    return intersection.not();
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
}
