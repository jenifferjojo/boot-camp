package com.tw.step.problem4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ParkingSystemTest {
  @Test
  void shouldAddParkingLotToTheParkingSystemWhenSpaceIsAvailable() {
    ParkingSystem parkingSystem = ParkingSystem.create(1);
    boolean isAdded = parkingSystem.add(ParkingLot.create(2));

    assertTrue(isAdded);
  }

  @Test
  void shouldNotAddParkingLotToTheParkingSystemWhenSpaceIsUnavailable() {
    ParkingSystem parkingSystem = ParkingSystem.create(1);
    parkingSystem.add(ParkingLot.create(2));

    assertFalse(parkingSystem.add(ParkingLot.create(2)));
  }

  @Test
  void shouldParkTheCarInTheParkingLotWhenThereIsSpace() {
    ParkingSystem parkingSystem = ParkingSystem.create(1);
    parkingSystem.add(ParkingLot.create(2));
    boolean isParked = parkingSystem.park(new Car(1));

    assertTrue(isParked);
  }

  @Test
  void shouldNotParkTheCarInTheParkingLotWhenThereIsNoSpace() {
    ParkingSystem parkingSystem = ParkingSystem.create(1);
    parkingSystem.add(ParkingLot.create(0));
    boolean isParked = parkingSystem.park(new Car(1));

    assertFalse(isParked);
  }
}
