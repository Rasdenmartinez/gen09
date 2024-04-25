package com.tienda.service;

import com.tienda.entity.Empleado;

import java.util.List;
import java.util.Optional;

public interface IEmpleadoService {
    public List<Empleado> readAll();
    public Optional<Empleado> readById(Long id);
    public Empleado create(Empleado empleado);
    public Empleado update(Empleado empleado);
    public void delete(Long id);
}
