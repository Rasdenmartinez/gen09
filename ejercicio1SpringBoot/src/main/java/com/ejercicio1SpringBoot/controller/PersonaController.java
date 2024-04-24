package com.ejercicio1SpringBoot.controller;

import com.ejercicio1SpringBoot.entity.Persona;
import com.ejercicio1SpringBoot.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/v1")
public class PersonaController {
    @Autowired
    IPersonaService personaService;

    @GetMapping("/persona")
    public List<Persona> leerTodos(){
        return personaService.readAll();
    }

    @GetMapping("/persona/{id}")
    public Optional<Persona> obtenerDepa (@PathVariable Long id){
        return personaService.readById(id);
    }

    @PostMapping("/persona")
    public Persona crear(@RequestBody Persona persona){
        return personaService.create(persona);
    }

    @PutMapping("/persona")
    public Persona actualizar(@RequestBody Persona persona){
        return personaService.update(persona);
    }

    @DeleteMapping("/persona/{id}")
    public void borrar(@PathVariable Long id){
        personaService.delete(id);
    }

    @GetMapping("/buscarNombre")
    public List<Persona> buscarNombre(@RequestParam(required = false) String nombre,
                                      @RequestParam(defaultValue = "0") Long edad){
        return personaService.buscarNombre(nombre,edad);
    }
}
