package com.example.foxprog.repository;

import com.example.foxprog.model.Trick;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrickRepository extends CrudRepository<Trick, Integer> {
  List<Trick> findAll();
  Trick getTrickById(int id);
}