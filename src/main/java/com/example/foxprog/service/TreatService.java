package com.example.foxprog.service;

import com.example.foxprog.model.Treat;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TreatService {
  Treat addDrink(Treat treat);
  Treat getDrink(int id);
  List<Treat> getAllTreat();
}
