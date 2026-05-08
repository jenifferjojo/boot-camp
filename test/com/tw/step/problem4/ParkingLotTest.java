package com.tw.step.problem4;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParkingLotTest {
  @Test
  void shouldParkTheCar() {
    List<Car> parkedCars = new ArrayList<>(2);
    ParkingLot parkingLot = new ParkingLot(parkedCars);

    Car car = new Car(1);
    parkingLot.parkCar(car);

    assertTrue(parkedCars.contains(car));
  }
}
