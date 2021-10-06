package ar.edu.unlam.PB2Examen;

import java.util.Date;

public class Curso {
	static private Integer codigo_curso=1;
	static final private Integer CANTIDAD_MAXIMA_ALUMNOS=50;
	static final private Integer CANTIDAD_MINIMA_ALUMNOS=10; 
	
	private Integer codigoCurso;
	//private Date fechaIninicalCursada;
	//private Date fechaFinalCursada;
	private Materia materia;
	private Profesor profesor;
	private boolean estadoDelCurso;
	private Alumno[] alumnosDelCurso=new Alumno[CANTIDAD_MAXIMA_ALUMNOS];
	
	public Curso(/*Date fechaInicio,Date fechaFin, */Profesor profesor/*,NombreMateria nombreMateria, String descripcion, Integer codigoMateria, String horario*/) {
		//this.fechaFinalCursada=fechaFin;
		//this.fechaIninicalCursada=fechaInicio;
		this.codigoCurso=codigo_curso;
		this.profesor=profesor;
		//this.materia=new Materia(nombreMateria,descripcion,codigoMateria,horario);
	}
	
	public boolean inscribirAlumnoACurso(Alumno alumno) {
		boolean seInscribio=false;
		for (int i = 0; i < alumnosDelCurso.length; i++) {
			if(alumnosDelCurso[i]==null) {
				seInscribio=true;
				break;
			}
		}
		return seInscribio;
	}
	
	public Integer cantidadAlumnosInscriptos() {
		Integer cantidadDeAlumnosInscriptos=0;
		for (int i = 0; i < alumnosDelCurso.length; i++) {
			if(alumnosDelCurso[i]!=null)
				cantidadDeAlumnosInscriptos++;
		}	
		return cantidadDeAlumnosInscriptos;
	}
	public void iniciarCurso() {
		this.estadoDelCurso=true;
	}
	
}
