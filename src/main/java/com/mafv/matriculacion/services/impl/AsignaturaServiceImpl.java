package com.mafv.matriculacion.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mafv.matriculacion.models.Asignatura;
import com.mafv.matriculacion.repositories.AsignaturaRepository;
import com.mafv.matriculacion.services.AsignaturaService;

@Service
public class AsignaturaServiceImpl implements AsignaturaService{

    @Autowired
    AsignaturaRepository repository;

    @Override
    public List<Asignatura> findAll() {
        return repository.findAll();
    }

    @Override
    public Asignatura findById(String id) {
        Optional<Asignatura> findById = repository.findById(id);
        if(findById != null){
            return findById.get();
        }
        return null;
    }

    @Override
    public Asignatura save(Asignatura asignatura) {
        return repository.save(asignatura);
    }

    @Override
    public void update(String id, Asignatura asignatura) {
        this.findById(id);
        asignatura.setCodigo(id);
        repository.save(asignatura);
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        repository.deleteAll();
    }
    
}
