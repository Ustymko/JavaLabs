package ua.lviv.iot.MusicShop.model;

import lombok.Getter;

@Getter
public class StringInstrument extends Instrument {
    private final int stringsAmount;

    public StringInstrument(int stringsAmount, double price, double weight, String name){
        super(price, weight, name, InstrumentType.STRING);
        this.stringsAmount = stringsAmount;
    }
}
