package com.ejercicio1SpringBoot.service;

import com.ejercicio1SpringBoot.entity.Persona;

import java.util.List;
import java.util.Optional;

public interface IPersonaService {
    public List<Persona> readAll();
    public Optional<Persona> readById(Long id);

    public Persona create(Persona   departamento);
    public Persona update(Persona   departamento);
    public void delete(Long   id);
    public List<Persona> buscarNombre(String nombre,Long edad);
}
