package com.ejercicio1SpringBoot.service.impl;

import com.ejercicio1SpringBoot.entity.Persona;
import com.ejercicio1SpringBoot.repository.PersonaRepository;
import com.ejercicio1SpringBoot.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaService implements IPersonaService {
    //CRUD --Create, Read, Update, Delete
    @Autowired
    PersonaRepository personaRepository;

    @Override
    public List<Persona> readAll() {
        return personaRepository.findAll();
    }

    @Override
    public Optional<Persona> readById(Long id) {
        return personaRepository.findById(id);
    }

    @Override
    public Persona create(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Persona update(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public void delete(Long id) {
        personaRepository.deleteById(id);
    }

    public List<Persona> buscarNombre(String nombre,Long edad){
        return personaRepository.findByNombreContainsIgnoreCaseAndEdadGreaterThan(nombre,edad);
    }


}
