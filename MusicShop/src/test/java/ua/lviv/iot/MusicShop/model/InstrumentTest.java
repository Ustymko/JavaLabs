package ua.lviv.iot.MusicShop.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InstrumentTest {
    Instrument result;

    @BeforeEach
    void setUp(){
        result = new PercussionInstrument("foo", 12, 15, "drums");

    }

    @Test
    void testCompareToAnotherInstrument(){
        Instrument expected = new PercussionInstrument("foo", 12, 15, "drums");
        Assertions.assertTrue(expected.compareToAnotherInstrument(result));
    }

    @Test
    void testGetters(){
        Instrument expected = new PercussionInstrument("foo", 12, 15, "drums");
        Assertions.assertTrue(expected.getType().equals(result.type) &&
                expected.getName().equals(result.name) && expected.getWeight() == result.weight &&
                expected.getPrice() == result.price);
    }


}
