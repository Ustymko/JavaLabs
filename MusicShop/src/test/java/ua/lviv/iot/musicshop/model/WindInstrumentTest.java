package ua.lviv.iot.musicshop.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WindInstrumentTest {

  WindInstrument result;

  @BeforeEach
  void setUp() {
    result = new WindInstrument(5.5, 12, 15, "drums");
  }

  @Test
  void testGetter() {
    double expectedLengthInSm = 5.5;
    Assertions.assertEquals(result.getLengthInSm(), expectedLengthInSm);
  }
}
