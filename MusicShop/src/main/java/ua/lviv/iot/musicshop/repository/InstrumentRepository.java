package ua.lviv.iot.musicshop.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.musicshop.entity.InstrumentEntity;

@Repository
public interface InstrumentRepository extends CrudRepository<InstrumentEntity, Long> {

}
