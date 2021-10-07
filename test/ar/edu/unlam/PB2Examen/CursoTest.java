package ar.edu.unlam.PB2Examen;

import static org.junit.Assert.*;

import org.junit.Test;

public class CursoTest {

	@Test
	public void queSeIngreseCorrectamenteUnAlumnoAlCurso() {
		Telefono telefono=new Telefono(54,54,54);
		Alumno alumno=new Alumno ("nombre","apellido",1,"mail",telefono);
		Profesor profesor=new Profesor ("nombre","apellido",2,"mail",telefono,"titulo",5);
		Materia materia=new Materia(NombreMateria.ASTRONOMIA,"descripcion",1,"11:30");
		Curso curso=new Curso(profesor,materia);
		
		assertTrue(curso.inscribirAlumnoACurso(alumno));
	}

}
