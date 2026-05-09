package com.tw.step.problem4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ParkingLotTest {
  @Test
  void shouldParkTheCarIfLotIsAvailable() {
    ParkingLot parkingLot = ParkingLot.create(2);
    Car car = new Car(1);

    assertTrue(parkingLot.park(car));
  }

  @Test
  void shouldNotParkTheCarIfLotIsFull() {
    ParkingLot parkingLot = ParkingLot.create(1);
    Car car = new Car(1);
    parkingLot.park(car);

    assertFalse(parkingLot.park(car));
  }

  @Test
  void shouldReturnTrueWhenTheParkingLotIsFull() {
    ParkingLot parkingLot = ParkingLot.create(1);
    Car car = new Car(1);

    parkingLot.park(car);

    assertTrue(parkingLot.isFull());
  }

  @Test
  void shouldReturnFalseWhenTheParkingLotIsNotFull() {
    ParkingLot parkingLot = ParkingLot.create(2);
    Car car = new Car(1);

    parkingLot.park(car);

    assertFalse(parkingLot.isFull());
  }
}
