package com.example.foxprog.repository;

import com.example.foxprog.model.Treat;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TreatRepository extends CrudRepository<Treat, Integer> {
  List<Treat> findAll();
  Treat getTreatById(int id);
}
