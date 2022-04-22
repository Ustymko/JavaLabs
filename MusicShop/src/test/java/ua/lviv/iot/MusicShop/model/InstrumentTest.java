package ua.lviv.iot.MusicShop.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InstrumentTest {
    Instrument instrument1, instrument2;

    @BeforeEach
    void setUp(){
        instrument1 = new PercussionInstrument("foo", 12, 15, "drums");

    }

    @Test
    void testCompareToAnotherInstrument(){
        instrument2 = new PercussionInstrument("foo", 12, 15, "drums");
        Assertions.assertTrue(instrument1.compareToAnotherInstrument(instrument2));
    }


}
