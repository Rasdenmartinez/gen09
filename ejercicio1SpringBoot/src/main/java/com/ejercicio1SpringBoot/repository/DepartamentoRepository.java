package com.ejercicio1SpringBoot.repository;

import com.ejercicio1SpringBoot.entity.Departamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento,Long> {
}
