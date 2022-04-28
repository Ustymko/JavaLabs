package ua.lviv.iot.MusicShop.model;

import lombok.Getter;

@Getter
public class PercussionInstrument extends Instrument {
    private final String beatMaterial;

    public PercussionInstrument(String beatMaterial, double price, double weight, String name) {
        super(price, weight, name, InstrumentType.PERCUSSION);
        this.beatMaterial = beatMaterial;
    }

    @Override
    public String getHeaders() {
        return super.getHeaders() + "beatMaterial";
    }

    @Override
    public String toCSV() {
        return super.toCSV() + beatMaterial;
    }
}
