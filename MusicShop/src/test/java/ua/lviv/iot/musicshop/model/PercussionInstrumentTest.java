package ua.lviv.iot.musicshop.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PercussionInstrumentTest {

  PercussionInstrument result;

  @BeforeEach
  void setUp() {
    result = new PercussionInstrument("foo", 12, 15, "drums");
  }

  @Test
  void testGetter() {
    String expectedBeatMaterial = "foo";
    Assertions.assertEquals(result.getBeatMaterial(), expectedBeatMaterial);
  }
}
