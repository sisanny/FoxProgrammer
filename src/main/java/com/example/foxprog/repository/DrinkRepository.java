package com.example.foxprog.repository;

import com.example.foxprog.model.Drink;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DrinkRepository extends CrudRepository<Drink, Integer> {
  List<Drink> findAll();
  Drink getDrinkById(int id);
}
