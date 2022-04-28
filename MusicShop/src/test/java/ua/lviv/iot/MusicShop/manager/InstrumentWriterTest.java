package ua.lviv.iot.MusicShop.manager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.MusicShop.model.Instrument;
import ua.lviv.iot.MusicShop.model.PercussionInstrument;
import ua.lviv.iot.MusicShop.model.StringInstrument;
import ua.lviv.iot.MusicShop.model.WindInstrument;

class InstrumentWriterTest {

    Path pathOfExpectedFile = Paths.get("C:\\MyFiles\\Coding\\Java\\JavaLabs\\MusicShop\\src\\test\\resources\\expected.csv");
    Path pathOfActualFile = Path.of("C:\\MyFiles\\Coding\\Java\\JavaLabs\\MusicShop\\result.csv");

    List<Instrument> instruments = new ArrayList<>();

    @BeforeEach
    void setUp(){
        Instrument ins1 = new PercussionInstrument("foo", 12, 15, "drums");
        Instrument ins2 = new WindInstrument(15.5, 40, 10, "saxophone");
        Instrument ins3 = new StringInstrument(6, 42,10, "guitar");
        Instrument ins4 = new StringInstrument(4, 51, 15, "violin");
        Instrument ins5 = new WindInstrument(17, 20, 1, "reed pipe");

        instruments.addAll(Arrays.asList(ins1, ins2, ins3, ins4, ins5));
    }

    @Test
    void testWriteToFile() throws IOException {
        Assertions.assertFalse(instruments.isEmpty());
        InstrumentWriter.writeToFile(instruments);
        try(FileReader expectedReader = new FileReader(String.valueOf(pathOfExpectedFile));
            BufferedReader expectedBR = new BufferedReader(expectedReader);
            FileReader actualReader = new FileReader(String.valueOf(pathOfActualFile));
            BufferedReader actualBR = new BufferedReader(actualReader)){
                String expectedLine = expectedBR.readLine();
                String actualLine = actualBR.readLine();
                while (expectedLine != null || actualLine != null){
                    Assertions.assertEquals(expectedLine, actualLine);
                    expectedLine = expectedBR.readLine();
                    actualLine = actualBR.readLine();

                }
        }
    }
}