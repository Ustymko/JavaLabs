package ua.lviv.iot.musicshop.exception;

public class InstrumentAlreadyExistsException extends RuntimeException {

  public InstrumentAlreadyExistsException() {
    super("Instrument with this id already exists");
  }
}
