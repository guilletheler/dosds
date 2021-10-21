package com.gt.dosds.repo.foo;

import java.util.Optional;

import com.gt.dosds.model.foo.Foo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FooRepository extends JpaRepository<Foo, Long> {
  
  Optional<Foo> findById(Long id); 
  
}