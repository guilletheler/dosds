package com.gt.dosds.model.foo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "REFOO")
public class ReFoo {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID")
  private Long id;
  
  @Column(name = "FOO")
  private String foo;
  
  public ReFoo(String foo) {
    this.foo = foo;
  }
  
  public ReFoo() {
    // Default constructor needed by JPA
  }
  
}