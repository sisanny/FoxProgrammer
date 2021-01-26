package com.example.foxprog.repository;

import com.example.foxprog.model.Food;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FoodRepository extends CrudRepository<Food, Integer> {
  List<Food> findAll();
  Food getFoodById(int id);
}
