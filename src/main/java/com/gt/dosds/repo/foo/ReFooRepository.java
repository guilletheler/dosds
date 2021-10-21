package com.gt.dosds.repo.foo;

import java.util.Optional;

import com.gt.dosds.model.foo.ReFoo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReFooRepository extends JpaRepository<ReFoo, Long> {
  
  Optional<ReFoo> findById(Long id); 
  
}