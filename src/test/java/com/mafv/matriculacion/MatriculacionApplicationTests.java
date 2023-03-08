package com.mafv.matriculacion;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mafv.matriculacion.models.Alumno;
import com.mafv.matriculacion.models.Asignatura;
import com.mafv.matriculacion.repositories.AlumnoRepository;
import com.mafv.matriculacion.repositories.AsignaturaRepository;

@SpringBootTest
class MatriculacionApplicationTests {

	@Autowired
	AlumnoRepository repoAlumno; 
	
	@Autowired
	AsignaturaRepository repoAsignatura; 

	@Test
	void crearalumnosTest() {

		Date fecha = new Date(2022-07-02);

		Alumno u1 = new Alumno();
		u1.setCodigo(1);
		u1.setEmail("email@gmail.com");
		u1.setFecha(fecha);
		u1.setTelefono("666777888");

        Alumno u2 = new Alumno();
		u2.setCodigo(2);
		u2.setEmail("email2@gmail.com");
		u2.setFecha(fecha);
		u2.setTelefono("777888999");

        Alumno u3 = new Alumno();
		u3.setCodigo(3);
		u3.setEmail("email3@gmail.com");
		u3.setFecha(fecha);
		u3.setTelefono("333444555");

		Asignatura a1 = new Asignatura();
		a1.setCodigo("MAT");
		a1.setDescripcion("Matemáticas");
		repoAsignatura.save(a1);

		Asignatura a2 = new Asignatura();
		a2.setCodigo("LEN");
		a2.setDescripcion("Lengua");
		repoAsignatura.save(a2);

		Asignatura a3 = new Asignatura();
		a3.setCodigo("ING");
		a3.setDescripcion("Inglés");
		repoAsignatura.save(a3);

		Asignatura a4 = new Asignatura();
		a4.setCodigo("REL");
		a4.setDescripcion("Religión");
		repoAsignatura.save(a4);

		Asignatura a5 = new Asignatura();
		a5.setCodigo("FIS");
		a5.setDescripcion("Física");
		repoAsignatura.save(a5);

		Asignatura a6 = new Asignatura();
		a6.setCodigo("QUI");
		a6.setDescripcion("Química");
		repoAsignatura.save(a6);

		List<Asignatura> asignaturaAlumno1 = new ArrayList<Asignatura>();
		asignaturaAlumno1.add(a1);
		asignaturaAlumno1.add(a2);
		asignaturaAlumno1.add(a5);

		List<Asignatura> asignaturaAlumno2 = new ArrayList<Asignatura>();
		asignaturaAlumno2.add(a3);
		asignaturaAlumno2.add(a4);
		asignaturaAlumno2.add(a1);

		u1.setAsignaturas(asignaturaAlumno1);
		u2.setAsignaturas(asignaturaAlumno2);
		
		repoAlumno.save(u1);
		repoAlumno.save(u2);
		repoAlumno.save(u3);

	}
}
