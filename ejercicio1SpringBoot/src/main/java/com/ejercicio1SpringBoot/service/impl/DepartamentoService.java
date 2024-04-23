package com.ejercicio1SpringBoot.service.impl;

import com.ejercicio1SpringBoot.entity.Departamento;
import com.ejercicio1SpringBoot.repository.DepartamentoRepository;
import com.ejercicio1SpringBoot.service.IDepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartamentoService implements IDepartamentoService {
    //CRUD --Create, Read, Update, Delete
    @Autowired
    DepartamentoRepository departamentoRepository;

    @Override
    public List<Departamento> readAll() {
        return departamentoRepository.findAll();
    }

    @Override
    public Optional<Departamento> readById(Long id) {
        return departamentoRepository.findById(id);
    }

    @Override
    public Departamento create(Departamento departamento) {
        return departamentoRepository.save(departamento);
    }

    @Override
    public Departamento update(Departamento departamento) {
        return departamentoRepository.save(departamento);
    }

    @Override
    public void delete(Long id) {
        departamentoRepository.deleteById(id);
    }


}
