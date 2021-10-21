package com.gt.dosds.model.bar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "BAR")
public class Bar {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID")
  private Long id;
  
  @Column(name = "BAR")
  private String bar;
  
  public Bar(String bar) {
    this.bar = bar;
  }
  
  public Bar() {
    // Default constructor needed by JPA
  }
}