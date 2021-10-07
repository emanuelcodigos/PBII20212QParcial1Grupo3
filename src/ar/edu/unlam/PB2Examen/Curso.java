package ar.edu.unlam.PB2Examen;

public class Curso {
 
	
	private Integer cantidadMinimaDeAlumnos;
	private Integer cantidadMaximaDeAlumnos; 
	private String fechaIninicalCursada;
	private String fechaFinalCursada;
	
	private Materia[] materias;
	
	public Curso(Integer minAlumnos,Integer maxAlumnos, Materia[] materias) {
		this.cantidadMaximaDeAlumnos = maxAlumnos;
		this.cantidadMinimaDeAlumnos = minAlumnos;
		this.materias = materias;
	}
	
	
	
	
	
	
	
	
	
	
}
