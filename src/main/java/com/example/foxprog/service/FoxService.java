package com.example.foxprog.service;

import com.example.foxprog.model.Fox;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {
    List<Fox> foxes = new ArrayList<Fox>();

    public FoxService() {
    }

    public void addFox(Fox fox) {
        foxes.add(fox);
    }

    public Fox getFox(String name) {
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
