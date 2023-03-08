package com.mafv.matriculacion.services;

import java.util.List;

import com.mafv.matriculacion.models.Asignatura;

public interface AsignaturaService {
    public List<Asignatura> findAll();
    public Asignatura findById(String id);
    public Asignatura save(Asignatura asignatura);
    public void update(String id, Asignatura asignatura);
    public void deleteById(String id);
    public void deleteAll();
}
