package ua.lviv.iot.MusicShop.model;

public class WindInstrument extends Instrument {
    private final double lengthInSm;


    public WindInstrument(double lengthInSm ,double price, double weight, String name){
        this.lengthInSm = lengthInSm;
        this.price = price;
        this.weight = weight;
        this.name = name;
        type = InstrumentType.WIND;
    }

    public double getLengthInSm() {
        return lengthInSm;
    }
}
