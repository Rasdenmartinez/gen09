package com.tienda.controller;

import com.tienda.entity.Empleado;
import com.tienda.service.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1")
public class EmpleadoController {
    @Autowired
    IEmpleadoService empleadoService;

    @GetMapping("/empleado")
    public List<Empleado> leerTodos(){
        return empleadoService.readAll();
    }

    @GetMapping("/empleado/{id}")
    public Optional<Empleado> obtenerEmpledo(@PathVariable Long id){
        return empleadoService.readById(id);
    }

    @PostMapping("/persona")
    public Empleado crear(@RequestBody Empleado empleado){
        return empleadoService.create(empleado);
    }

    @PutMapping("/empleado")
    public Empleado actualizar(@RequestBody Empleado empleado) {
        return empleadoService.update(empleado);
    }

    @DeleteMapping("/empleado/id")
    public void borrar(@PathVariable Long id){
        empleadoService.delete(id);
    }
}
