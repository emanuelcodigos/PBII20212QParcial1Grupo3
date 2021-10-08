package ar.edu.unlam.PB2Examen;

import static org.junit.Assert.*;

import org.junit.Test;

public class Tests {
	
	@Test
	public void queSePuedaCrearUnTelefono() {
		Integer codPais = 54;
		Integer codArea = 11;
		Integer numero = 12345678;
		Telefono telefono = new Telefono(codPais, codArea, numero);
		
		String valorEsperado = "54 - 11 - 12345678";
		
		assertEquals(valorEsperado, telefono.toString());
	}
	
	@Test
	public void queSePuedaCrearUnaPersona() {
		String nombre = "nombre";
		String apellido = "apellido";
		Integer dni = 12345678;
		String mail = "mail";
		Telefono telefono = new Telefono(54, 11, 12345678);
		
		Persona persona = new Persona(nombre, apellido, dni, mail, telefono);
		
		assertNotNull(persona);
	}
	
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
	public void queSePuedaCrearUnProfesor() {
		String nombre = "nombre";
		String apellido = "apellido";
		Integer dni = 12345678;
		String mail = "mail";
		Telefono telefono = new Telefono(54, 11, 12345678);
		String titulo = "titulo";
		Integer salario = 25000;
		
		Profesor profesor = new Profesor(nombre, apellido, dni, mail, telefono, titulo, salario);
		
		assertNotNull(profesor);
	}
	
	@Test
	public void queSePuedaCrearUnaMateria() {
		NombreMateria Nombremateria = NombreMateria.FISICA;
		String descripcion = "descripcion";
		Integer codigoMateria = 1;
		String horario = "horario";
		
		Materia materia = new Materia(Nombremateria, descripcion, codigoMateria, horario);
			
		assertNotNull(materia);
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
/*	@Test
	public void queSePuedaObtenerLaCalificacion() {
		Escuela escuela = new Escuela("nombre", 30);
		Telefono telefono = new Telefono(54, 11, 12345678);
		Profesor profesor = new Profesor("nombre", "apellido", 12345678, "mail", telefono, "titulo", 25000);
		Curso curso = new Curso(profesor, NombreMateria.FISICA, "descripcion", 1, "horario");
		Alumno alumno = new Alumno("nombre", "apellido", 12345678, "mail", telefono);
		Calificacion calificacion = new Calificacion(NombreMateria.FISICA, 8.0, 8.0, 8.0);
		escuela.agregarCurso(curso);
		escuela.agregarAlumnoAUnCurso(NombreMateria.FISICA, alumno);
		escuela.agregarCalificacionAAlumnos(12345678, calificacion);
		
		Calificacion valorEsperado = calificacion;

		assertEquals(valorEsperado, escuela.buscarUnAlumnoPorDni(12345678).getCalificacion(NombreMateria.FISICA));
	}
*/
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

		NombreMateria valorEsperado = NombreMateria.FISICA;

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
	
	@Test
	public void queSePuedaObtenerLaInformacionDeUnCurso() {
		Telefono telefono = new Telefono(54, 11, 12345678);
		Profesor profesor = new Profesor("nombre", "apellido", 12345678, "mail", telefono, "titulo", 25000);
		Curso curso = new Curso(profesor, NombreMateria.FISICA, "descripcion", 1, "horario");
		
		String valorEsperado = "Curso: codigoCurso=" + curso.getCodigoCurso() + ", materia=" + curso.getMateria() + ", profesor="+ curso.getProfesor();
		
		assertEquals(valorEsperado, curso.toString());
	}

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
				
		assertEquals(curso, escuela.buscarUnCursoPorCodigo(codigoCurso));
	 }

	@Test
	public void queSePuedaBuscarUnCursoPorMateria() {
		Escuela escuela = new Escuela("nombre", 30);
		Telefono telefono = new Telefono(54, 11, 12345678);
		Profesor profesor = new Profesor("nombre", "apellido", 12345678, "mail", telefono, "titulo", 25000);
		Curso curso = new Curso(profesor, NombreMateria.FISICA, "descripcion", 1, "horario");
		
		escuela.agregarCurso(curso);
				
		assertEquals(curso, escuela.buscarUnCursoPorMateria(NombreMateria.FISICA));
	}	
 	@Test
 	public void queSePuedaBuscarAlumnosPorCodigoDelCurso() {
		Integer codigoCurso = 1;
		Escuela escuela = new Escuela("nombre", 30);
		Telefono telefono = new Telefono(54, 11, 12345678);
		Profesor profesor = new Profesor("nombre", "apellido", 12345678, "mail", telefono, "titulo", 25000);
		Curso cursoEsperado = new Curso(profesor, NombreMateria.FISICA, "descripcion", codigoCurso, "horario");
		Alumno alumno = new Alumno("nombre", "apellido", 12345678, "mail", telefono);

		escuela.agregarCurso(cursoEsperado);
		

		assertTrue(escuela.agregarAlumnoAUnCurso(NombreMateria.FISICA, alumno));
	}

	@Test
	public void queSePuedaBuscarUnAlumnoPorDni() {
		Integer dni = 12345678;
		Escuela escuela = new Escuela("nombre", 30);
		Telefono telefono = new Telefono(54, 11, 12345678);
		Profesor profesor = new Profesor("nombre", "apellido", 12345678, "mail", telefono, "titulo", 25000);
		Curso curso = new Curso(profesor, NombreMateria.FISICA, "descripcion", 1, "horario");
		Alumno alumno = new Alumno("nombre", "apellido", dni, "mail", telefono);
		
		escuela.agregarCurso(curso);
		escuela.agregarAlumnoAUnCurso(NombreMateria.FISICA, alumno);
	
		assertEquals(alumno, escuela.buscarUnAlumnoPorDni(12345678));
	}

	@Test
	public void queSePuedaCalificarUnAlumno() {
		Escuela escuela = new Escuela("nombre", 30);
		Telefono telefono = new Telefono(54, 11, 12345678);
		Profesor profesor = new Profesor("nombre", "apellido", 12345678, "mail", telefono, "titulo", 25000);
		Curso curso = new Curso(profesor, NombreMateria.FISICA, "descripcion", 1, "horario");
		Alumno alumno = new Alumno("nombre", "apellido", 12345678, "mail", telefono);
		//alumno.setLegajo(1);
		Calificacion calificacion = new Calificacion(NombreMateria.FISICA, 8.0, 8.5, 9.0);
		
		escuela.agregarCurso(curso);
		curso.inscribirAlumnoACurso(alumno);
		alumno.agregarCalificacion(calificacion);

		assertTrue(escuela.calificarUnAlumno(12345678, NombreMateria.FISICA, 8.0, 8.5, 9.0));
	}
/*	@Test
	public void queSePuedaBuscarElMejorPromedioDeUnCurso() {
		Escuela escuela = new Escuela("nombre", 30);
		Telefono telefono = new Telefono(54, 11, 12345678);
		Profesor profesor = new Profesor("nombre", "apellido", 12345678, "mail", telefono, "titulo", 25000);
		Curso curso = new Curso(profesor, NombreMateria.FISICA, "descripcion", 1, "horario");
		Alumno alumno1 = new Alumno("nombre", "apellido", 12345679, "mail", telefono);
		alumno1.setLegajo(1);
		Alumno alumno2 = new Alumno("nombre", "apellido", 12345671, "mail", telefono);
		alumno2.setLegajo(2);
		Alumno alumno3 = new Alumno("nombre", "apellido", 12345678, "mail", telefono);
		alumno2.setLegajo(3);
		Alumno alumno4 = new Alumno("nombre", "apellido", 12345673, "mail", telefono);
		alumno2.setLegajo(4);

		escuela.agregarCurso(curso);
		escuela.agregarAlumnoAUnCurso(NombreMateria.FISICA, alumno1);
		escuela.agregarAlumnoAUnCurso(NombreMateria.FISICA, alumno2);
		escuela.agregarAlumnoAUnCurso(NombreMateria.FISICA, alumno3);
		escuela.agregarAlumnoAUnCurso(NombreMateria.FISICA, alumno4);
		escuela.calificarUnAlumno(1, NombreMateria.FISICA, 8.0, 8.5, 9.0);
		escuela.calificarUnAlumno(2, NombreMateria.FISICA, 6.0, 5.5, 6.0);
		escuela.calificarUnAlumno(3, NombreMateria.FISICA, 8.0, 9.5, 10.0);
		escuela.calificarUnAlumno(4, NombreMateria.FISICA, 7.0, 7.5, 7.0);
		
		Alumno alumnoEsperado = escuela.buscarUnAlumnoPorDni(12345678);
		
		assertEquals(alumnoEsperado, escuela.buscarElMejorPromedioDeUnCurso());
	}
*/

}
