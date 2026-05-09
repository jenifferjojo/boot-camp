package com.tw.step.problem4;

import java.util.HashMap;
import java.util.Map;

public class ParkingSystem {
  private final Map<Integer, ParkingLot> parkingLots;
  private final int capacity;
  private Integer parkingLotId;

  private ParkingSystem(Map<Integer, ParkingLot> parkingLots, int capacity) {
    this.parkingLots = parkingLots;
    this.capacity = capacity;
    this.parkingLotId = 1;
  }

  public static ParkingSystem create(int capacity) {
    Map<Integer, ParkingLot> parkingLots = new HashMap<>(capacity);
    return new ParkingSystem(parkingLots, capacity);
  }

  public boolean add(ParkingLot parkingLot) {
    if (this.parkingLots.size() < this.capacity) {
      parkingLots.put(this.parkingLotId++, parkingLot);
      return true;
    }
    return false;
  }

  public boolean park(Car car) {
    for (Map.Entry<Integer, ParkingLot> entry : this.parkingLots.entrySet()) {
      ParkingLot lot = entry.getValue();
      if (!(lot.isFull())) {
        return lot.park(car);
      }
    }

    return false;
  }

}
