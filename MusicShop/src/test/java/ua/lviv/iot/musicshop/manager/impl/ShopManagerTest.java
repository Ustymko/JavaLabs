package ua.lviv.iot.musicshop.manager.impl;

import org.junit.jupiter.api.*;
import ua.lviv.iot.musicshop.model.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ShopManagerTest {

  private ShopManager shopManager;
  private List<Instrument> instruments;

  @BeforeEach
  void setUp() {
    shopManager = new ShopManager();
    instruments = new LinkedList<>();
    Instrument ins1 = new PercussionInstrument("foo", 12, 20, "drums");
    Instrument ins2 = new WindInstrument(15.5, 40, 12, "saxophone");
    Instrument ins3 = new StringInstrument(6, 42, 10, "guitar");
    Instrument ins4 = new StringInstrument(4, 51, 15, "violin");
    Instrument ins5 = new WindInstrument(17, 20, 1, "reed pipe");
    instruments.addAll((Arrays.asList(ins1, ins2, ins3, ins4, ins5)));
    shopManager.addInstruments(instruments);
  }

  @Test
  public void testAddInstruments() {
    Assertions.assertFalse(shopManager.getInstruments().isEmpty());
    Assertions.assertEquals(instruments.size(), shopManager.getInstruments().size());
  }

  @Test
  public void testFindByType() {
    InstrumentType someType = InstrumentType.STRING;
    var instrumentsOfSomeType = shopManager.findByType(someType);
    Assertions.assertFalse(instrumentsOfSomeType.isEmpty());
    instrumentsOfSomeType.forEach(instrument -> {
      Assertions.assertEquals(instrument.getType(), someType);
    });
  }

  @Test
  public void testFindForBand() {
    int membersAmount = 3;
    var instrumentsForSomeBand = shopManager.findForBand(membersAmount);
    Assertions.assertFalse(instrumentsForSomeBand.isEmpty());
    Assertions.assertTrue(shopManager.getKeys().size() >= membersAmount);
    Assertions.assertEquals(membersAmount, instrumentsForSomeBand.size());
  }

  @Test
  public void testSortByPrice() {
    Instrument ins1 = new StringInstrument(4, 51, 15, "violin");
    Instrument ins2 = new StringInstrument(6, 42, 10, "guitar");
    Instrument ins3 = new WindInstrument(15.5, 40, 12, "saxophone");
    Instrument ins4 = new WindInstrument(17, 20, 1, "reed pipe");
    Instrument ins5 = new PercussionInstrument("foo", 12, 20, "drums");

    var expected = (Arrays.asList(ins1, ins2, ins3, ins4, ins5));
    var result = shopManager.sortByPrice(true);
    Assertions.assertFalse(result.isEmpty());
    Assertions.assertEquals(expected.size(), result.size());

    Instrument[] expectedArray = expected.toArray(new Instrument[expected.size()]);
    Instrument[] resultArray = result.toArray(new Instrument[result.size()]);

    for (int i = 0; i < expectedArray.length; i++) {
      Assertions.assertTrue(expectedArray[i].compareToAnotherInstrument(resultArray[i]));
    }
  }

  @Test
  public void testSortByWeight() {
    Instrument ins1 = new PercussionInstrument("foo", 12, 20, "drums");
    Instrument ins2 = new StringInstrument(4, 51, 15, "violin");
    Instrument ins3 = new WindInstrument(15.5, 40, 12, "saxophone");
    Instrument ins4 = new StringInstrument(6, 42, 10, "guitar");
    Instrument ins5 = new WindInstrument(17, 20, 1, "reed pipe");

    var expected = (Arrays.asList(ins1, ins2, ins3, ins4, ins5));
    var result = shopManager.sortByWeight(true);
    Assertions.assertFalse(result.isEmpty());
    Assertions.assertEquals(expected.size(), result.size());

    Instrument[] expectedArray = expected.toArray(new Instrument[expected.size()]);
    Instrument[] resultArray = result.toArray(new Instrument[result.size()]);

    for (int i = 0; i < expectedArray.length; i++) {
      Assertions.assertTrue(expectedArray[i].compareToAnotherInstrument(resultArray[i]));
    }
  }

}