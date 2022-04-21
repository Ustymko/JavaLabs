package ua.lviv.iot.MusicShop.manager;

import ua.lviv.iot.MusicShop.model.Instrument;
import ua.lviv.iot.MusicShop.model.InstrumentType;

import java.util.List;
import java.util.Map;

public interface IShopManager {

    List<Instrument> findByType(InstrumentType type);

    List<Instrument> findForBand(int membersAmount);

    void addInstruments(List<Instrument> instruments);

    List<Instrument> sortByPrice(boolean reverse);

    List<Instrument> sortByWeight(boolean reverse);

}
