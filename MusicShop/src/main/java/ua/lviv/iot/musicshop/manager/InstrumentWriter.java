package ua.lviv.iot.musicshop.manager;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Comparator;
import java.util.List;
import ua.lviv.iot.musicshop.model.Instrument;
import ua.lviv.iot.musicshop.model.InstrumentType;

public class InstrumentWriter {

  public static void writeToFile(List<Instrument> instruments) throws IOException {
    if (!instruments.isEmpty()) {
      try (FileWriter writer = new FileWriter("result.csv", StandardCharsets.UTF_8)) {

        instruments.sort(Comparator.comparing(Instrument::getType));

        InstrumentType previousType = InstrumentType.NULL;

        for (var instrument : instruments) {
          if (!instrument.getType().equals(previousType)) {
            writer.write(instrument.getHeaders());
            writer.write("\r\n");
            previousType = instrument.getType();
          }
          writer.write(instrument.toCSV());
          writer.write("\r\n");
        }
        writer.flush();
      }
    }
  }
}
