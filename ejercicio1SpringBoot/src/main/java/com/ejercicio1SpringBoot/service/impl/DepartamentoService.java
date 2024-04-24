package com.ejercicio1SpringBoot.service.impl;

import com.ejercicio1SpringBoot.entity.Departamento;
import com.ejercicio1SpringBoot.repository.DepartamentoRepository;
import com.ejercicio1SpringBoot.service.IDepartamentoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
@Slf4j
public class DepartamentoService implements IDepartamentoService {

    //CRUD --Create, Read, Update, Delete
    @Autowired
    DepartamentoRepository departamentoRepository;

    @Override
    public List<Departamento> readAll() {
        List<Departamento> list=departamentoRepository.findAll();
        list.stream().map(s-> s.toString()).forEach(s-> log.info(s));
        return list;
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
