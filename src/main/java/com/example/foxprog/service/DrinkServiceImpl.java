package com.example.foxprog.service;

import com.example.foxprog.model.Drink;
import com.example.foxprog.repository.DrinkRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrinkServiceImpl implements DrinkService{
  final DrinkRepository drinkRepository;

  public DrinkServiceImpl(DrinkRepository drinkRepository) {
    this.drinkRepository = drinkRepository;
  }

  @Override
  public Drink addDrink(Drink drink) {
    return drinkRepository.save(drink);
  }

  @Override
  public Drink getDrink(int id) {
    return drinkRepository.getDrinkById(id);
  }

  @Override
  public List<Drink> getAllDrink() {
    return drinkRepository.findAll();
  }
}
