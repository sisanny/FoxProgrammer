package com.example.foxprog.service;

import com.example.foxprog.model.Fox;
import com.example.foxprog.repository.FoxRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class FoxServiceImpl implements FoxService{

  final FoxRepository foxRepository;

  @Autowired
  public FoxServiceImpl(FoxRepository foxRepository) {
    this.foxRepository = foxRepository;
  }

  public void addFox(Fox fox) {
    foxRepository.save(fox);
  }

  public Fox getFox(String name) {
    List<Fox> foxes = foxRepository.findAll();
    for (int i = 0; i < foxes.size(); i++) {
      if (foxes.get(i).getName().equals(name)) {
        return foxes.get(i);
      }
    }
    return null;
  }

  public String getDate() {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    LocalDateTime now = LocalDateTime.now();
    return dtf.format(now);
  }
}
