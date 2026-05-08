package com.tw.step.problem3;

import java.util.Objects;

public class Volume {
  private final double value;
  private final VolumeUnit unit;

  public Volume(double value, VolumeUnit unit) {
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
    return Double.compare(this.value * this.unit.factor, volume.value * volume.unit.factor) == 0;
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.value, this.unit);
  }
}
