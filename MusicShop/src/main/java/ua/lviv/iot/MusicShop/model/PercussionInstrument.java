package ua.lviv.iot.MusicShop.model;

public class PercussionInstrument extends Instrument{
    private final String beatMaterial;

    public PercussionInstrument(String beatMaterial, double price, double weight, String name){
        this.beatMaterial = beatMaterial;
        this.price = price;
        this.weight = weight;
        this.name = name;
        type = InstrumentType.PERCUSSION;
    }

    public String getBeatMaterial(){
        return beatMaterial;
    }

}
