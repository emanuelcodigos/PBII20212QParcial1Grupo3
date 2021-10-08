package ar.edu.unlam.PB2Examen;

import static org.junit.Assert.*;

import org.junit.Test;

public class EscuelaTest {

	
	@Test
	public void queSePuedaAgregarUnAlumnoALaListaDeAlumnosDeLaEscuela() {
	
		Escuela escuela = new Escuela("500", 5);
		Telefono tel = new Telefono(054, 11, 012354);
		Alumno alumno = new Alumno("juan", "perez", 4444, "jaunadvev", tel);
		assertTrue(escuela.agregarAlArrayDeAlumnos(alumno));
	}
	@Test
	//NO FUNCIONA
	public void queSePuedaBuscarUnAlmuno() {
		Escuela escuela = new Escuela("500", 5);
		Telefono tel = new Telefono(054, 11, 012354);
		Alumno alumno = new Alumno("juan", "perez", 4444, "jaunadvev", tel);
		Alumno alumnoDos = new Alumno("pepe", "perez", 51919, "jaunadvev", tel);
		Profesor profe = new Profesor("uvdv", "vwevwev", 777491, "wvewvew", tel, "evwev", 1515);
	
		
		Curso curso = new Curso(profe, NombreMateria.CIENCIAS_SOCIALES, "erbwebwrb", 55, "vbwevev");
		escuela.agregarCurso(curso);
		escuela.agregarAlumnoAUnCurso(1, alumnoDos);
		escuela.agregarAlumnoAUnCurso(1, alumno);
		
		Alumno obtenido = escuela.buscarUnAlumnoPorDni(4444);
		
		assertEquals(alumno, obtenido);
		
		
	}

	
	
	
	
	
}











