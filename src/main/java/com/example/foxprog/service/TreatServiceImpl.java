package com.example.foxprog.service;

import com.example.foxprog.model.Treat;
import com.example.foxprog.repository.TreatRepository;

import java.util.List;

public class TreatServiceImpl implements TreatService{

  final TreatRepository treatRepository;

  public TreatServiceImpl(TreatRepository treatRepository) {
    this.treatRepository = treatRepository;
  }

  @Override
  public Treat addDrink(Treat treat) {
    return treatRepository.save(treat);
  }

  @Override
  public Treat getDrink(int id) {
    return treatRepository.getTreatById(id);
  }

  @Override
  public List<Treat> getAllTreat() {
    return treatRepository.findAll();
  }
}
