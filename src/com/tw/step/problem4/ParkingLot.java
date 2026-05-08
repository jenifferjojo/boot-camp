package com.tw.step.problem4;

import java.util.List;

public class ParkingLot {
  private final List<Car> parked;

  public ParkingLot(List<Car> parked) {
    this.parked = parked;
  }

  public void parkCar(Car car) {
    parked.add(car);
  }
}
