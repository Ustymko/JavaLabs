package ua.lviv.iot.musicshop.exception;

public class InstrumentNotFoundException extends RuntimeException {

  public InstrumentNotFoundException() {
    super("Instrument not found");
  }

}
