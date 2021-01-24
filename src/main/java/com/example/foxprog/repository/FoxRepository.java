package com.example.foxprog.repository;

import com.example.foxprog.model.Fox;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoxRepository extends CrudRepository<Fox, Integer> {
}
