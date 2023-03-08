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

import com.mafv.matriculacion.models.Alumno;
import com.mafv.matriculacion.services.AlumnoService;

@RestController
public class AlumnoController {
    
    @Autowired
    AlumnoService alumnoService;

    @GetMapping("/alumnos")
    List<Alumno> all(){
        return alumnoService.findAll();
    }
    
    @GetMapping("/alumnos/{id}")
    Alumno findAlumno(@PathVariable int id){
        return alumnoService.findById(id);
    }

    @DeleteMapping("/alumnos/{id}")
    void deleteAlumno(@PathVariable int id){
        alumnoService.deleteById(id);
    }

    @PostMapping("/alumnos")
    Alumno crearAlumno(@RequestBody Alumno alumno){
        alumnoService.save(alumno);
        return alumno;
    }

    @PutMapping("/alumnos/{id}")
    void modificarAlumno(@PathVariable int id, @RequestBody Alumno alumno){
        alumnoService.update(id, alumno);
    }
}
