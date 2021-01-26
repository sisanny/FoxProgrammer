package com.example.foxprog.service;

import com.example.foxprog.model.Food;

import java.util.List;

public interface FoodService {
  Food addFood(Food food);
  Food getFood(int id);
  List<Food> getAllFood();
}
