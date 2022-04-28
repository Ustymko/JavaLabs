package ua.lviv.iot.MusicShop.manager.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ua.lviv.iot.MusicShop.manager.IShopManager;
import ua.lviv.iot.MusicShop.model.Instrument;
import ua.lviv.iot.MusicShop.model.InstrumentType;

public class ShopManager implements IShopManager {

    private final Map<String, List<Instrument>> instrumentsMap = new HashMap<>();

    @Override
    public List<Instrument> findByType(InstrumentType type) {
        List<Instrument> instrumentsOfOneType = new ArrayList<>();
        instrumentsMap.values().forEach(instruments -> {
            instruments.forEach(instrument -> {
                if (instrument.getType() == type) {
                    instrumentsOfOneType.add(instrument);
                }
            });
        });
        return instrumentsOfOneType;
    }

    @Override
    public List<Instrument> findForBand(int membersAmount) {
        List<Instrument> instrumentsForBand = new LinkedList<>();
        int instrumentsNumberController = 0;
        for (List<Instrument> instruments : instrumentsMap.values()) {
            if (instrumentsNumberController >= membersAmount) {
                break;
            } else {
                instrumentsNumberController += 1;
            }
            instrumentsForBand.add(instruments.get(0));
        }
        return instrumentsForBand;
    }

    @Override
    public void addInstruments(List<Instrument> instruments) {
        instruments.forEach(instrument -> {
            String name = instrument.getName();
            var existingInstrument = instrumentsMap.get(name);

            if (existingInstrument == null) {
                existingInstrument = new LinkedList<>();
                instrumentsMap.put(name, existingInstrument);
            }

            existingInstrument.add(instrument);
        });
    }

    @Override
    public List<Instrument> sortByPrice(boolean reverse) {
        List<Instrument> allInstruments = new ArrayList<>();
        instrumentsMap.values().forEach(allInstruments::addAll);
        allInstruments.sort(Comparator.comparing(Instrument::getPrice));
        if (reverse) {
            Collections.reverse(allInstruments);
        }
        return allInstruments;
    }

    @Override
    public List<Instrument> sortByWeight(boolean reverse) {
        List<Instrument> allInstruments = new ArrayList<>();
        instrumentsMap.values().forEach(allInstruments::addAll);
        allInstruments.sort(Comparator.comparing(Instrument::getWeight));
        if (reverse) {
            Collections.reverse(allInstruments);
        }
        return allInstruments;
    }

    @Override
    public List<Instrument> getInstruments() {
        List<Instrument> result = new ArrayList<>();
        instrumentsMap.values().forEach(result::addAll);
        return result;
    }

    @Override
    public Set<String> getKeys() {
        return instrumentsMap.keySet();
    }

}
