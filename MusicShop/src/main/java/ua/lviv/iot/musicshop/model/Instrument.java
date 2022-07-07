package ua.lviv.iot.musicshop.model;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public abstract class Instrument {

  protected int id;

  protected double price;

  protected double weight;

  protected String name;

  protected InstrumentType type;

  public boolean compareToAnotherInstrument(final Instrument instrument) {
    return (this.price == instrument.price && this.type == instrument.type
        && this.name.equals(instrument.name) && this.weight == instrument.weight);
  }

  public Instrument(double price, double weight, String name, InstrumentType type) {
    this.id = 0;
    this.price = price;
    this.weight = weight;
    this.name = name;
    this.type = type;
  }

  public String getHeaders() {
    return "price, weight, name, type, ";
  }

  public String toCSV() {
    return price + ", " + weight + ", " + name + ", " + type + ", ";
  }
}
