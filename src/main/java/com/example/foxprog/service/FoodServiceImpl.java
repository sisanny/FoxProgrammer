package com.example.foxprog.service;

import com.example.foxprog.model.Food;
import com.example.foxprog.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {
  @Autowired
  FoodRepository foodRepository;

  @Override
  public Food addFood(Food food) {
    return foodRepository.save(food);
  }

  @Override
  public Food getFood(int id) {
    return foodRepository.getFoodById(id);
  }


  @Override
  public List<Food> getAllFood() {
    return foodRepository.findAll();
  }
}
