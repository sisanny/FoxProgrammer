package com.example.foxprog.service;

import com.example.foxprog.model.Trick;
import com.example.foxprog.repository.TrickRepository;

import java.util.List;

public class TrickServiceImpl implements TrickService{
  final TrickRepository trickRepository;

  public TrickServiceImpl(TrickRepository trickRepository) {
    this.trickRepository = trickRepository;
  }

  @Override
  public Trick addTrick(Trick trick) {
    return trickRepository.save(trick);
  }

  @Override
  public Trick getTrick(int id) {
    return trickRepository.getTrickById(id);
  }

  @Override
  public List<Trick> getAllTricks() {
    return trickRepository.findAll();
  }
}
