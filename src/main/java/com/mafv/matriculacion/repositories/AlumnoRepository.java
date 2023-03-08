package com.mafv.matriculacion.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mafv.matriculacion.models.Alumno;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Integer>{
    
}
