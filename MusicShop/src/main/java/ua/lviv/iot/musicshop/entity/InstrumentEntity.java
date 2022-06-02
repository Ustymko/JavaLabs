package ua.lviv.iot.musicshop.entity;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "instruments")
public class InstrumentEntity {

  @Id
  private Long id;

  private double price;

  private double weight;

  private String name;

  @Enumerated(EnumType.STRING)
  private InstrumentType type;

  public InstrumentEntity() {

  }
}
