package com.example.bd_ejercicioclase.repository;


import com.example.bd_ejercicioclase.model.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends CrudRepository<Persona, Long> {

}
