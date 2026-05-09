package com.tw.step.problem4;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
  private final List<Car> parkingArea;
  private final Integer capacity;

  private ParkingLot(List<Car> lot, Integer capacity) {
    this.parkingArea = lot;
    this.capacity = capacity;
  }

  public static ParkingLot create(Integer capacity) {
    List<Car> lot = new ArrayList<>(capacity);
    return new ParkingLot(lot, capacity);
  }

  public boolean park(Car car) {
    if (!this.isFull()) {
      parkingArea.add(car);
      return true;
    }

    return false;
  }

  public boolean isFull() {
    return this.parkingArea.size() == this.capacity;
  }
}
