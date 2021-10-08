package ar.edu.unlam.PB2Examen;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tests {

	@Test
	public void queSePuedaCrearUnAlumno() {
		String nombre = "nombre";
		String apellido = "apellido";
		Integer dni = 12345678;
		String mail = "mail";
		Telefono telefono = new Telefono(54, 11, 12345678);

		Alumno alumno = new Alumno(nombre, apellido, dni, mail, telefono);

		assertNotNull(alumno);
	}

	@Test
	public void queSePuedanCrearCalificaciones() {
		Calificacion calificacion = new Calificacion(NombreMateria.FISICA, 8.0, 8.0, 8.0);

		assertNotNull(calificacion);
	}

	@Test
	public void queSePuedaAgregarLasCalificaciones() {
		Telefono telefono = new Telefono(54, 11, 12345678);
		Alumno alumno = new Alumno("nombre", "apellido", 12345678, "mail", telefono);

		Calificacion calificacion = new Calificacion(NombreMateria.FISICA, 8.0, 8.0, 8.0);

		assertTrue(alumno.agregarCalificacion(calificacion));
	}

	@Test
	public void queNoSePuedaAgregarMasDe9Calificaciones() {
		Telefono telefono = new Telefono(54, 11, 12345678);
		Alumno alumno = new Alumno("nombre", "apellido", 12345678, "mail", telefono);
		Calificacion calificacion = new Calificacion(NombreMateria.FISICA, 8.0, 8.0, 8.0);
	
		alumno.agregarCalificacion(calificacion);
		alumno.agregarCalificacion(calificacion);
		alumno.agregarCalificacion(calificacion);
		alumno.agregarCalificacion(calificacion);
		alumno.agregarCalificacion(calificacion);
		alumno.agregarCalificacion(calificacion);
		alumno.agregarCalificacion(calificacion);
		alumno.agregarCalificacion(calificacion);
		alumno.agregarCalificacion(calificacion);

		assertFalse(alumno.agregarCalificacion(calificacion));
	}

	@Test
	public void queSePuedaObtenerLaCalificacion() {
		Telefono telefono = new Telefono(54, 11, 12345678);
		Alumno alumno = new Alumno("nombre", "apellido", 12345678, "mail", telefono);
		Calificacion calificacion = new Calificacion(NombreMateria.FISICA, 8.0, 8.0, 8.0);
	
		alumno.agregarCalificacion(calificacion);

		Calificacion valorEsperado = calificacion;

		assertEquals(valorEsperado, alumno.getCalificacion(NombreMateria.FISICA));
	}

	@Test
	public void queSePuedaObtenerLosDatosDelAlumno() {
		Telefono telefono = new Telefono(54, 11, 12345678);
		Alumno alumno = new Alumno("nombre", "apellido", 12345678, "mail", telefono);
		alumno.setLegajo(1);

		String valorEsperado = "Alumno: legajo=1, nombre=nombre, apellido=apellido, dni=12345678";

		assertEquals(valorEsperado, alumno.toString());
	}

	@Test
	public void queSePuedaCalcularElPromedioDeLasNotas() {
		Calificacion calificacion = new Calificacion(NombreMateria.FISICA, 9.0, 8.0, 8.5);

		double valorEsperado = 8.5;

		assertEquals(valorEsperado, calificacion.calcularPromedio(), 0.02);
	}

	@Test
	public void queSiLasCalificacionasEstanAprobadasQueDevuelvaUnTrue() {
		Calificacion calificacion = new Calificacion(NombreMateria.FISICA, 8.0, 8.0, 8.0);

		assertTrue(calificacion.obtenerEstado());
	}

	@Test
	public void queSePuedaObtenerLaMateriaSegunLasCalificaciones() {
		Calificacion calificacion = new Calificacion(NombreMateria.FISICA, 8.0, 8.0, 8.0);

		String valorEsperado = "FISICA";

		assertEquals(valorEsperado, calificacion.getMateria());
	}

	@Test
	public void queSePuedaCrearUnCurso() {
		Telefono telefono = new Telefono(54, 11, 12345678);
		Profesor profesor = new Profesor("nombre", "apellido", 12345678, "mail", telefono, "titulo", 25000);
		Curso curso = new Curso(profesor, NombreMateria.FISICA, "descripcion", 1, "horario");

		assertNotNull(curso);
	}

	@Test
	public void queSePuedaInscribirUnAlumnoAUnCurso() {
		Telefono telefono = new Telefono(54, 11, 12345678);
		Profesor profesor = new Profesor("nombre", "apellido", 12345678, "mail", telefono, "titulo", 25000);
		Curso curso = new Curso(profesor, NombreMateria.FISICA, "descripcion", 1, "horario");
		Alumno alumno = new Alumno("nombre", "apellido", 12345678, "mail", telefono);

		assertTrue(curso.inscribirAlumnoACurso(alumno));
	}

	@Test
	public void queSePuedaObtenerLaCantidadDeAlumnosInscriptos() {
		Telefono telefono = new Telefono(54, 11, 12345678);
		Profesor profesor = new Profesor("nombre", "apellido", 12345678, "mail", telefono, "titulo", 25000);
		Curso curso = new Curso(profesor, NombreMateria.FISICA, "descripcion", 1, "horario");
		Alumno alumno = new Alumno("nombre", "apellido", 12345678, "mail", telefono);

		curso.inscribirAlumnoACurso(alumno);
		curso.inscribirAlumnoACurso(alumno);

		Integer valorEsperado = 2;

		assertEquals(valorEsperado, curso.cantidadAlumnosInscriptos());
	}

 	@Test
 	public void queSePuedaObtenerInformacionDeUnAlumnoPorDni() {
		Integer dni = 12345678;
		Telefono telefono = new Telefono(54, 11, 12345678);
		Profesor profesor = new Profesor("nombre", "apellido", 12345678, "mail", telefono, "titulo", 25000);
		Curso curso = new Curso(profesor, NombreMateria.FISICA, "descripcion", 1, "horario");
		Alumno alumno = new Alumno("nombre", "apellido", dni, "mail", telefono);
		
		curso.inscribirAlumnoACurso(alumno);
 	
		assertEquals(alumno, curso.getAlumno(dni));
 	}
	
/* 	@Test
	public void queSePuedaObtenerLaInformacionDeUnCurso() {
		Telefono telefono = new Telefono(54, 11, 12345678);
		Profesor profesor = new Profesor("nombre", "apellido", 12345678, "mail", telefono, "titulo", 25000);
		Curso curso = new Curso(profesor, NombreMateria.FISICA, "descripcion", 1, "horario");
		
		String valorEsperado = "Curso: codigoCurso=1234, materia=FISICA, profesor=profesor";
		
		assertEquals(valorEsperado, curso.toString());
	}
*/
	@Test
	public void queSePuedaCrearUnaEscuela() {
		Escuela escuela = new Escuela("nombre", 30);

		assertNotNull(escuela);
	}

	@Test
	public void queSePuedaAgregarUnCursoALaEscuela() {
		Escuela escuela = new Escuela("nombre", 30);
		Telefono telefono = new Telefono(54, 11, 12345678);
		Profesor profesor = new Profesor("nombre", "apellido", 12345678, "mail", telefono, "titulo", 25000);
		Curso curso = new Curso(profesor, NombreMateria.FISICA, "descripcion", 1, "horario");

		assertTrue(escuela.agregarCurso(curso));
	}

	@Test
	 public void queSePuedaBuscarUnCursoPorSuCodigo() {
		Integer codigoCurso = 1234;
		Escuela escuela = new Escuela("nombre", 30);
		Telefono telefono = new Telefono(54, 11, 12345678);
		Profesor profesor = new Profesor("nombre", "apellido", 12345678, "mail", telefono, "titulo", 25000);
		Curso curso = new Curso(profesor, NombreMateria.FISICA, "descripcion", codigoCurso, "horario");
		
		escuela.agregarCurso(curso);
		curso.setCodigoCurso(codigoCurso);
				
		assertEquals(curso, escuela.buscarUnCurso(codigoCurso));
	 }

	@Test
	public void queSePuedaBuscarUnCursoPorMateria() {
		Escuela escuela = new Escuela("nombre", 30);
		Telefono telefono = new Telefono(54, 11, 12345678);
		Profesor profesor = new Profesor("nombre", "apellido", 12345678, "mail", telefono, "titulo", 25000);
		Curso curso = new Curso(profesor, NombreMateria.FISICA, "descripcion", 1, "horario");
		
		escuela.agregarCurso(curso);
				
		assertEquals(curso, escuela.buscarUnCurso(NombreMateria.FISICA));
	}
/*	
 	@Test
 	public void queSePuedaBuscarAlumnosPorCodigoDelCurso() {
		Integer codigoCurso = 1234;
		Escuela escuela = new Escuela("nombre", 30);
		Telefono telefono = new Telefono(54, 11, 12345678);
		Profesor profesor = new Profesor("nombre", "apellido", 12345678, "mail", telefono, "titulo", 25000);
		Curso curso = new Curso(profesor, NombreMateria.FISICA, "descripcion", codigoCurso, "horario");
		Alumno alumno = new Alumno("nombre", "apellido", 12345678, "mail", telefono);

		escuela.agregarCurso(curso);
		curso.inscribirAlumnoACurso(alumno);

		assertEquals(alumno, escuela.buscarUnCurso(codigoCurso));
	}
	
	@Test
	public void queSePuedaBuscarUnAlumnoPorDni() {
		Integer dni = 12345678;
		Escuela escuela = new Escuela("nombre", 30);
		Telefono telefono = new Telefono(54, 11, 12345678);
		Profesor profesor = new Profesor("nombre", "apellido", 12345678, "mail", telefono, "titulo", 25000);
		Curso curso = new Curso(profesor, NombreMateria.FISICA, "descripcion", 1, "horario");
		Alumno alumno = new Alumno("nombre", "apellido", dni, "mail", telefono);
	
		curso.inscribirAlumnoACurso(alumno);
	
		assertEquals(alumno, escuela.buscarUnAlumnoPorDni(12345678));
	}
*/
	@Test
	public void queSePuedaCalificarUnAlumno() {
		Escuela escuela = new Escuela("nombre", 30);
		Telefono telefono = new Telefono(54, 11, 12345678);
		Profesor profesor = new Profesor("nombre", "apellido", 12345678, "mail", telefono, "titulo", 25000);
		Curso curso = new Curso(profesor, NombreMateria.FISICA, "descripcion", 1, "horario");
		Alumno alumno = new Alumno("nombre", "apellido", 12345678, "mail", telefono);
		alumno.setLegajo(1);
		Calificacion calificacion = new Calificacion(NombreMateria.FISICA, 8.0, 8.5, 9.0);
		
		escuela.agregarCurso(curso);
		curso.inscribirAlumnoACurso(alumno);
		alumno.agregarCalificacion(calificacion);

		assertTrue(escuela.calificarUnAlumno(1, NombreMateria.FISICA, 8.0, 8.5, 9.0));
	}
	/*
	@Test
	public void queSePuedaBuscarElMejorPromedioDeUnCurso() {
		Escuela escuela = new Escuela("nombre", 30);
		Telefono telefono = new Telefono(54, 11, 12345678);
		Profesor profesor = new Profesor("nombre", "apellido", 12345678, "mail", telefono, "titulo", 25000);
		Curso curso = new Curso(profesor, NombreMateria.FISICA, "descripcion", 1, "horario");
		Alumno alumno1 = new Alumno("nombre", "apellido", 12345678, "mail", telefono);
		alumno1.setLegajo(1);
		Alumno alumno2 = new Alumno("nombre", "apellido", 12345678, "mail", telefono);
		alumno2.setLegajo(2);
		Calificacion calificacion1 = new Calificacion(NombreMateria.FISICA, 8.0, 8.5, 9.0);
		Calificacion calificacion2 = new Calificacion(NombreMateria.FISICA, 7.0, 6.5, 8.0);

		
		escuela.agregarCurso(curso);
		curso.inscribirAlumnoACurso(alumno1);
		curso.inscribirAlumnoACurso(alumno2);
		alumno1.agregarCalificacion(calificacion1);
		alumno2.agregarCalificacion(calificacion2);

		assertEquals(alumno2,escuela.buscarElMejorPromedioDeUnCurso());
	}
	*/
	
}
