package com.mafv.matriculacion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mafv.matriculacion.models.Asignatura;

@Repository
public interface AsignaturaRepository extends JpaRepository<Asignatura, String>{
    
}
