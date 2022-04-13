package com.example.bd_ejercicioclase.service;


import com.example.bd_ejercicioclase.model.Persona;

import java.util.List;

public interface PersonaService {

    public List<Persona> listarPersonas();

    public void guardar(Persona persona);

    public void eliminar(Persona persona);

    public Persona encontrarPersona(Persona persona);
}

