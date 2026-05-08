package com.tw.step.problem3;

public class Gallon {

  private final double value;

  public Gallon(double value) {
    this.value = value;
  }

  public static Gallon create(double value) {
    return new Gallon(value);
  }

  public Litre toLitre() {
    return Litre.create(this.value * 3.78);
  }

  public boolean same(Litre litre) {
    Litre volumeInLitres = this.toLitre();
    return volumeInLitres.equals(litre.toLitre());
  }
}
