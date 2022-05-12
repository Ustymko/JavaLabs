package ua.lviv.iot.musicshop.model;

import lombok.Getter;

@Getter
public class StringInstrument extends Instrument {

  private final int stringsAmount;

  public StringInstrument(int stringsAmount, double price, double weight, String name) {
    super(price, weight, name, InstrumentType.STRING);
    this.stringsAmount = stringsAmount;
  }

  @Override
  public String getHeaders() {
    return super.getHeaders() + "stringsAmount";
  }

  @Override
  public String toCSV() {
    return super.toCSV() + stringsAmount;
  }
}
