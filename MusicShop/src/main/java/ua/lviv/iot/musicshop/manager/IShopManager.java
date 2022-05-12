package ua.lviv.iot.musicshop.manager;

import java.util.List;
import java.util.Set;
import ua.lviv.iot.musicshop.model.Instrument;
import ua.lviv.iot.musicshop.model.InstrumentType;

public interface IShopManager {

  List<Instrument> findByType(InstrumentType type);

  List<Instrument> findForBand(int membersAmount);

  void addInstruments(List<Instrument> instruments);

  List<Instrument> sortByPrice(boolean reverse);

  List<Instrument> sortByWeight(boolean reverse);

  List<Instrument> getInstruments();

  Set<String> getKeys();

}
