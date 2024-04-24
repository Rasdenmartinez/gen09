package com.ejercicio1SpringBoot.controller;

import com.ejercicio1SpringBoot.entity.Departamento;
import com.ejercicio1SpringBoot.service.IDepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1")
public class DepartamentoController {
    @Autowired
    IDepartamentoService departamentoService;

    @GetMapping("/departamento")
    public List<Departamento> leerTodos(){
        return departamentoService.readAll();
    }

    @GetMapping("/departamento/{id}")
    public Optional<Departamento> obtenerDepa (@PathVariable Long id){
        return departamentoService.readById(id);
    }

    @PostMapping("/departamento")
    public Departamento crear(@RequestBody Departamento departamento){
        return departamentoService.create(departamento);
    }

    @PutMapping("/departamento")
    public Departamento actualizar(@RequestBody Departamento departamento){
        return departamentoService.update(departamento);
    }

    @DeleteMapping("/departamento/{id}")
    public void borrar(@PathVariable Long id){
        departamentoService.delete(id);
    }
}
