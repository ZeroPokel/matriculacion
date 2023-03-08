package com.mafv.matriculacion.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mafv.matriculacion.models.Asignatura;
import com.mafv.matriculacion.services.AsignaturaService;

@RestController
public class AsignaturaController {
    
    @Autowired
    AsignaturaService asignaturaService;

    @GetMapping("/asignaturas")
    List<Asignatura> all(){
        return asignaturaService.findAll();
    }
    
    @GetMapping("/asignaturas/{id}")
    Asignatura findAsignatura(@PathVariable String id){
        return asignaturaService.findById(id);
    }

    @DeleteMapping("/asignaturas/{id}")
    void deleteAsignatura(@PathVariable String id){
        asignaturaService.deleteById(id);
    }

    @PostMapping("/asignaturas")
    Asignatura crearAsignatura(@RequestBody Asignatura asignatura){
        asignaturaService.save(asignatura);
        return asignatura;
    }

    @PutMapping("/asignaturas/{id}")
    void modificarAsignatura(@PathVariable String id, @RequestBody Asignatura asignatura){
        asignaturaService.update(id, asignatura);
    }
}
