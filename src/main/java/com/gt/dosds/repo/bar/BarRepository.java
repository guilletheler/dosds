package com.gt.dosds.repo.bar;

import java.util.Optional;

import com.gt.dosds.model.bar.Bar;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarRepository extends JpaRepository<Bar, Long> {
  
  Optional<Bar> findById(Long id); 
  
}