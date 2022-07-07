package ua.lviv.iot.musicshop.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
import ua.lviv.iot.musicshop.controller.InstrumentController;


@Component
public class InstrumentConfiguration extends ResourceConfig {

  public InstrumentConfiguration(Class<?>... classes) {
    register(InstrumentController.class);
  }
}
