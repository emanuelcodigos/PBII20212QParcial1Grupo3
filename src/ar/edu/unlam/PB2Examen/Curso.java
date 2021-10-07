package ar.edu.unlam.PB2Examen;

import java.util.Date;

public class Curso {
	static private Integer codigo_curso=1;
	static final private Integer CANTIDAD_MAXIMA_ALUMNOS=4;
	static final private Integer CANTIDAD_MINIMA_ALUMNOS=1; 
	
	private Integer codigoCurso;
	//private Date fechaIninicalCursada;
	//private Date fechaFinalCursada;
	private Materia materia;
	private Profesor profesor;
	private boolean estadoDelCurso;
	private Alumno[] alumnosDelCurso=new Alumno[CANTIDAD_MAXIMA_ALUMNOS];
	
	public Curso(/*Date fechaInicio,Date fechaFin, */Profesor profesor,NombreMateria nombreMateria, String descripcion, Integer codigoMateria, String horario) {
		//this.fechaFinalCursada=fechaFin;
		//this.fechaIninicalCursada=fechaInicio;
		this.codigoCurso=codigo_curso;
		this.profesor=profesor;
		this.materia=new Materia(nombreMateria,descripcion,codigoMateria,horario);
	}
	public Curso(/*Date fechaInicio,Date fechaFin, */Profesor profesor,Materia materia) {
		//this.fechaFinalCursada=fechaFin;
		//this.fechaIninicalCursada=fechaInicio;
		this.codigoCurso=codigo_curso;
		this.profesor=profesor;
		this.materia=materia;
	}
	
	public boolean inscribirAlumnoACurso(Alumno alumno) {
		boolean seInscribio=false;
		for (int i = 0; i < alumnosDelCurso.length; i++) {
			if(alumnosDelCurso[i]==null) {
				alumnosDelCurso[i]=alumno;
				seInscribio=true;
				break;
			}
		}
		return seInscribio;
	}
	
	public int cantidadAlumnosInscriptos() {
		int cantidadDeAlumnosInscriptos=0;
		for (int i = 0; i < alumnosDelCurso.length; i++) {
			if(alumnosDelCurso[i]!=null)
				cantidadDeAlumnosInscriptos++;
		}	
		return cantidadDeAlumnosInscriptos;
	}
	public void iniciarCurso() {
		this.estadoDelCurso=true;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoCurso == null) ? 0 : codigoCurso.hashCode());
		result = prime * result + ((materia == null) ? 0 : materia.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		if (codigoCurso == null) {
			if (other.codigoCurso != null)
				return false;
		} else if (!codigoCurso.equals(other.codigoCurso))
			return false;
		if (materia == null) {
			if (other.materia != null)
				return false;
		} else if (!materia.equals(other.materia))
			return false;
		return true;
	}
	
}	


	
