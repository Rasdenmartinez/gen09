package com.ejercicio1SpringBoot.repository;

import com.ejercicio1SpringBoot.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PersonaRepository extends JpaRepository<Persona,Long> {
    public List<Persona> findByNombreContainsIgnoreCaseAndEdadGreaterThan (String nombre,Long edad);
}
