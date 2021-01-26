package com.example.foxprog.service;

import com.example.foxprog.model.Drink;

import java.util.List;

public interface DrinkService {
  Drink addDrink(Drink drink);
  Drink getDrink(int id);
  List<Drink> getAllDrink();
}
