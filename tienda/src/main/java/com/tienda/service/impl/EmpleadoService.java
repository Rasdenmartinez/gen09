package com.tienda.service.impl;

import com.tienda.entity.Empleado;
import com.tienda.repository.EmpleadoRepository;
import com.tienda.service.IEmpleadoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class EmpleadoService implements IEmpleadoService {

    @Autowired
    EmpleadoRepository empleadoRepository;

    @Override
    public List<Empleado> readAll() {
        List<Empleado> list = empleadoRepository.findAll();
        list.stream().map(s -> s.toString()).forEach(s -> log.info(s));
        return list;
    }

    @Override
    public Optional<Empleado> readById(Long id) {
        return empleadoRepository.findById(id);
    }

    @Override
    public Empleado create(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    @Override
    public Empleado update(Empleado empleado) {
        return empleadoRepository.save(empleado);
    }

    @Override
    public void delete(Long id) {
        empleadoRepository.deleteById(id);
    }


}
