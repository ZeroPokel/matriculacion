package com.mafv.matriculacion.services;

import java.util.List;

import com.mafv.matriculacion.models.Alumno;

public interface AlumnoService {
    public List<Alumno> findAll();
    public Alumno findById(int id);
    public Alumno save(Alumno alumno);
    public void update(int id, Alumno alumno);
    public void deleteById(int id);
    public void deleteAll();
}
