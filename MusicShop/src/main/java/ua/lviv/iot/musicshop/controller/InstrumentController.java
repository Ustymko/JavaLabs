package ua.lviv.iot.musicshop.controller;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.musicshop.entity.InstrumentEntity;
import ua.lviv.iot.musicshop.service.InstrumentService;

@RestController
@Consumes("application/json")
@Produces("application/json")
@Path("/instruments/rest")
public class InstrumentController {

  @Autowired
  InstrumentService service;

  public InstrumentController(InstrumentService service) {
    this.service = service;
  }

  @GET
  @Path("/")
  public List<InstrumentEntity> getAllInstruments() {
    return service.getAllInstruments();
  }

  @GET
  @Path("/{id}")
  public InstrumentEntity getStudentById(@PathParam("id") Long id) {
    return service.getInstrumentById(id);
  }

  @POST
  @Path("/")
  public void saveInstrument(@RequestBody InstrumentEntity instrument) {
    service.saveInstrument(instrument);
  }

  @PUT
  @Path("/{id}")
  public void updateInstrument(@RequestBody InstrumentEntity newInstrument,
      @PathParam(value = "id") Long id) {
    service.updateInstrument(id, newInstrument);
  }

  @DELETE
  @Path("/{id}")
  public void deleteInstrument(@PathParam(value = "id") Long id) {
    service.deleteInstrument(id);
  }


}
