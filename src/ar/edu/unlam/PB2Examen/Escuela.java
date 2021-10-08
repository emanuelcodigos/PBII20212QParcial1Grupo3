package ar.edu.unlam.PB2Examen;

public class Escuela {

	private String nombre;
	private Curso[] cursos;

	private Alumno[] alumnos = new Alumno[10];

	public Escuela(String nombre, Integer cantidadCursos) {
		this.nombre = nombre;
		this.cursos = new Curso[cantidadCursos];

	}

	public Boolean agregarCurso(Curso curso) {
		for (int i = 0; i < cursos.length; i++) {
			if (cursos[i] == null) {
				cursos[i] = curso;
				return true;
			}
		}
		return false;
	}

	public Curso buscarUnCursoPorCodigo(Integer codigoCurso) {
		for (int i = 0; i < cursos.length; i++) {
			if (cursos[i] != null) {
				if (cursos[i].getCodigoCurso().equals(codigoCurso)) {
					return cursos[i];
				}
			}
		}
		return null;
	}

	public Curso buscarUnCursoPorMateria(NombreMateria materia) {
		for (int i = 0; i < cursos.length; i++) {
			if (cursos[i] != null) {
				if (cursos[i].getMateria().getTitulo().equals(materia)) {
					return cursos[i];
				}
			}
		}

		return null;
	}

	public String getNombre() {
		return nombre;
	}

	public Curso[] getCursos() {
		return cursos;
	}

	public Alumno[] buscarAlumnosPorCurso(Integer idCurso) {
		Curso curso = buscarUnCursoPorCodigo(idCurso);
		if (curso != null) {
			return curso.getAlumnos();
		}
		return null;
	}

	public Alumno buscarUnAlumnoPorDni(Integer dni) {
		Alumno alumno = null;
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null && alumnos[i].getDni().equals(dni)) {
				alumno = alumnos[i];
				break;
			}
		}
		return alumno;
	}

	public void agregarCalificacionAAlumnos(Integer dni, Calificacion calificacion) {
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null && alumnos[i].getDni().equals(dni)) {
				alumnos[i].agregarCalificacion(calificacion);
			}
		}
	}

	public Boolean calificarUnAlumno(Integer dni, NombreMateria materia, Double notaUno, Double notaDos,
			Double notaTres) {
		Boolean resultado = false;
		for (int i = 0; i < cursos.length; i++) {
			if (cursos[i] != null) {
				for (int j = 0; j < cursos[i].getAlumnos().length; j++) {
					if (cursos[i].getAlumnos()[j].getDni().equals(dni)) {
						Calificacion calificacion = new Calificacion(materia, notaUno, notaDos, notaTres);
						cursos[i].getAlumnos()[j].agregarCalificacion(calificacion);
						agregarCalificacionAAlumnos(dni, calificacion);
						resultado = true;
						break;
					}
				}

			}
		}
		return resultado;
	}

/*	public Alumno buscarElMejorPromedioDeUnCurso() {
		Alumno alumnoPromedio = null;
		Double promedio = 0.0;
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] != null) {
				for (int j = 0; j < alumnos[i].getCalificaciones().length; j++) {
					if (alumnos[i].getCalificaciones()[j] != null && alumnos[i].getCalificaciones()[j].calcularPromedio() > promedio) {
						promedio = alumnos[i].getCalificaciones()[j].calcularPromedio();
						alumnoPromedio = alumnos[i];
					}
				}
			}
		}
		return alumnoPromedio;
	}
*/
	public Boolean agregarAlArrayDeAlumnos(Alumno alumno) {
		for (int i = 0; i < alumnos.length; i++) {
			if (alumnos[i] == null) {
				alumnos[i] = alumno;
				return true;
			}
		}
		return false;
	}

	public Boolean agregarAlumnoAUnCurso(NombreMateria materia, Alumno alumno) {
		Boolean respuesta = false;
		for (int i = 0; i < cursos.length; i++) {
			if (cursos[i] != null && cursos[i].getMateria().getTitulo().equals(materia)) {
				cursos[i].inscribirAlumnoACurso(alumno);
				agregarAlArrayDeAlumnos(alumno);
				respuesta = true;
				break;
			}
		}
		return respuesta;
	}

}
