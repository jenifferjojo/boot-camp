package com.tw.step.problem3;

import java.util.Objects;

public class Litre{
  private final double value;

  public Litre(double value) {
    this.value = value;
  }

  public static Litre create(double value) {
    return new Litre(value);
  }

  public Litre toLitre() {
    return this;
  }

  public boolean same(Gallon gallon) {
    Litre litre = this.toLitre();
    return litre.equals(gallon.toLitre());
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Litre litre = (Litre) o;
    return Double.compare(value, litre.value) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(value);
  }
}
