package ua.lviv.iot.musicshop.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.musicshop.exception.InstrumentAlreadyExistsException;
import ua.lviv.iot.musicshop.exception.InstrumentNotFoundException;
import ua.lviv.iot.musicshop.entity.InstrumentEntity;
import ua.lviv.iot.musicshop.repository.InstrumentRepository;

@Service
public class InstrumentService {

  @Autowired
  InstrumentRepository repository;

  public List<InstrumentEntity> getAllInstruments() {
    return (List<InstrumentEntity>) repository.findAll();
  }

  public InstrumentEntity getInstrumentById(Long id) {
    InstrumentEntity instrument = repository.findById(id)
        .orElseThrow(InstrumentNotFoundException::new);
    return instrument;
  }

  public void saveInstrument(InstrumentEntity instrument) {
    if (repository.findById(instrument.getId()).isPresent()) {
      throw new InstrumentAlreadyExistsException();
    }
    repository.save(instrument);
  }

  public void updateInstrument(Long id, InstrumentEntity newInstrument) {
    Optional<InstrumentEntity> optionalInstrument = repository.findById(id);
    if (optionalInstrument.isEmpty()) {
      throw new InstrumentNotFoundException();
    }
    InstrumentEntity instrument = repository.findById(id).get();
    instrument.setName(newInstrument.getName());
    instrument.setPrice(newInstrument.getPrice());
    instrument.setWeight(newInstrument.getWeight());
    instrument.setName(newInstrument.getName());
    repository.save(instrument);

  }

  public void deleteInstrument(Long id) {
    repository.deleteById(id);
  }
}
