package com.example.foxprog.service;

import com.example.foxprog.model.Trick;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TrickService {
  Trick addTrick(Trick trick);
  Trick getTrick(int id);
  List<Trick> getAllTricks();
}
