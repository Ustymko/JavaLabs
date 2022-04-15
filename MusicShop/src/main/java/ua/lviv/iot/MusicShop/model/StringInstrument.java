package ua.lviv.iot.MusicShop.model;

public class StringInstrument extends Instrument {
    private final int stringsAmount;

    public StringInstrument(int stringsAmount, double price, double weight, String name){
        this.stringsAmount = stringsAmount;
        this.price = price;
        this.weight = weight;
        this.name = name;
        type = InstrumentType.STRING;
    }

    public int getStringsAmount() {
        return stringsAmount;
    }
}
