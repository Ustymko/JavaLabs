package ua.lviv.iot.musicshop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ua.lviv.iot.musicshop.manager.impl.ShopManager;
import ua.lviv.iot.musicshop.model.Instrument;
import ua.lviv.iot.musicshop.model.PercussionInstrument;
import ua.lviv.iot.musicshop.model.StringInstrument;
import ua.lviv.iot.musicshop.model.WindInstrument;

public class Main {

  public static void main(String[] args) {
    Instrument ins1 = new PercussionInstrument("foo", 12, 15, "drums");
    Instrument ins2 = new WindInstrument(15.5, 40, 10, "saxophone");
    Instrument ins3 = new StringInstrument(6, 42, 10, "guitar");
    Instrument ins4 = new StringInstrument(4, 51, 15, "violin");
    Instrument ins5 = new WindInstrument(17, 20, 1, "reed pipe");

    List<Instrument> instruments = new ArrayList<>(Arrays.asList(ins1, ins2, ins3, ins4, ins5));

    instruments.forEach(instrument -> System.out.println("Name: "
        + instrument.getName() + " Price: " + instrument.getPrice()
        + " Weight:" + instrument.getWeight() + " Type: " + instrument.getType()));

    System.out.println();

    ShopManager manager = new ShopManager();
    manager.addInstruments(instruments);

    var instrumentsSortedByPrice = manager.sortByPrice(false);
    System.out.println("sortedByPrice:");
    instrumentsSortedByPrice.forEach(instrument -> System.out.println("Name: "
        + instrument.getName() + " Price: " + instrument.getPrice()
        + " Weight:" + instrument.getWeight() + " Type: " + instrument.getType()));

    System.out.println();

    var instrumentsSortedByWeight = manager.sortByWeight(false);
    System.out.println("sortedByWeight:");
    instrumentsSortedByWeight.forEach(instrument -> System.out.println("Name: "
        + instrument.getName() + " Price: " + instrument.getPrice()
        + " Weight:" + instrument.getWeight() + " Type: " + instrument.getType()));
  }

}
