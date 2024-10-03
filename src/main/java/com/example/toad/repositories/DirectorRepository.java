package com.example.toad.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.toad.entities.Director;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
public interface DirectorRepository extends CrudRepository<Director, Integer> {

}