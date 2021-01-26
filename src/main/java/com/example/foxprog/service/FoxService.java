package com.example.foxprog.service;

import com.example.foxprog.model.Fox;
import org.springframework.stereotype.Service;

@Service
public interface FoxService {

    void addFox(Fox fox);
    Fox getFox(String name);
    String getDate();
}
