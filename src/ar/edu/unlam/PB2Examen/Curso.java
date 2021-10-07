package ar.edu.unlam.PB2Examen;

public class Curso {

	private Integer cantidadMinimaDeAlumnos;
	private Integer cantidadMaximaDeAlumnos;
	private Integer cantidadMaximaDeMaterias;
	private String fechaIninicalCursada;
	private String fechaFinalCursada;
	private Materia[] materiasDelCurso;
	private Integer codigoCurso;
	private Alumno[] alumnosDelCurso;

	public Curso(Integer cantidadMinimaDeAlumnos, Integer cantidadMaximaDeAlumnos, String fechaIninicalCursada,
			String fechaFinalCursada, Integer codigoCurso, Integer cantidadMaximaDeMaterias) {
		this.cantidadMaximaDeMaterias = cantidadMaximaDeMaterias;
		this.cantidadMinimaDeAlumnos = cantidadMinimaDeAlumnos;
		this.cantidadMaximaDeAlumnos = cantidadMaximaDeAlumnos;
		this.fechaIninicalCursada = fechaIninicalCursada;
		this.fechaFinalCursada = fechaFinalCursada;
		this.codigoCurso = codigoCurso;
		this.materiasDelCurso = new Materia[cantidadMaximaDeMaterias];
		this.alumnosDelCurso = new Alumno[cantidadMaximaDeAlumnos];
	}

	public boolean agregarMateriaAlCurso(Materia materia) {
		
		if (materiasDelCurso.length < cantidadMaximaDeMaterias) {
			materiasDelCurso[materiasDelCurso.length] = materia;
			return true;
		}
		return false;
	}

	public boolean agregarAlumnoAlCurso(Alumno alumno) {
		
		if (alumnosDelCurso.length < cantidadMaximaDeAlumnos) {
			alumnosDelCurso[alumnosDelCurso.length] = alumno;
			return true;
		}
		return false;
	}

}
