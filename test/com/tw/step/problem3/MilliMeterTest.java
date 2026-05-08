package com.tw.step.problem3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MilliMeterTest {
  @Test
  void shouldReturnTrueWhenCentimeterIsEqualToMM() {
    Centimeter centimeter = Centimeter.create(1);
    MilliMeter milliMeter = new MilliMeter(10);

    assertTrue(milliMeter.same(centimeter));
  }

  @Test
  void shouldReturnFalseWhenCentimeterIsNotEqualToMM() {
    Centimeter centimeter = Centimeter.create(1);
    MilliMeter milliMeter = new MilliMeter(11);

    assertFalse(milliMeter.same(centimeter));
  }
}
