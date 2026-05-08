package com.tw.step.problem3;

import java.util.Objects;

public class Volume {
  private final double value;
  private final VolumeUnit unit;

  private Volume(double value, VolumeUnit unit) {
    this.value = value;
    this.unit = unit;
  }

  public static Volume create(double value, VolumeUnit unit) {
    return new Volume(value, unit);
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) return false;
    Volume volume = (Volume) o;
    return Double.compare(this.value, volume.value) == 0 && this.unit == volume.unit;
  }

  public boolean sameAs(Volume volume) {
    return Double.compare(this.value * this.unit.factor, volume.value * volume.unit.factor) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.value, this.unit);
  }

  public Volume add(Volume that) {
    double thisInLitres = this.value * this.unit.factor;
    double thatInLitres = that.value * that.unit.factor;
    return Volume.create(thisInLitres + thatInLitres, VolumeUnit.LITRE);
  }
}
