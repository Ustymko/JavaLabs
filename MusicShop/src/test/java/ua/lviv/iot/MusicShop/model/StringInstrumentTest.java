package ua.lviv.iot.MusicShop.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringInstrumentTest {
    StringInstrument result;

    @BeforeEach
    void setUp(){
        result = new StringInstrument(5, 12, 15, "drums");
    }

    @Test
    void testGetter(){
        int expectedStringsAmount = 5;
        Assertions.assertEquals(result.getStringsAmount(), expectedStringsAmount);
    }
}
