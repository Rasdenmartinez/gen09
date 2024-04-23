package com.ejercicio1SpringBoot.service;

import com.ejercicio1SpringBoot.entity.Departamento;

import java.util.List;
import java.util.Optional;

public interface IDepartamentoService {
    public List<Departamento> readAll();
    public Optional<Departamento> readById(Long id);

    public Departamento create(Departamento   departamento);
    public Departamento update(Departamento   departamento);
    public void delete(Long   id);
}
