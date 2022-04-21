package ua.lviv.iot.MusicShop.model;

import lombok.Getter;

@Getter
public class WindInstrument extends Instrument {
    private final double lengthInSm;

    public WindInstrument(double lengthInSm ,double price, double weight, String name){
        super(price, weight, name, InstrumentType.WIND);
        this.lengthInSm = lengthInSm;
    }

}
