package ua.lviv.iot.MusicShop.model;

public abstract class Instrument {
    protected double price;
    protected double weight;
    protected String name;
    protected InstrumentType type;

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public InstrumentType getType(){
        return type;
    }
}
