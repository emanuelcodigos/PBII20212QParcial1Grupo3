package ar.edu.unlam.PB2Examen;

public class Escuela {

	private String nombre;
	private Curso[] curso;
	
	
	public Escuela(String nombre, Curso[] curso) {
		this.nombre = nombre;
		this.curso = curso;
	}
	
	public Escuela(String nombre, Integer cantidadCursos) {
		this.nombre = nombre;
		this.curso = new Curso[cantidadCursos];
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Curso[] getCurso() {
		return curso;
	}

	public void setCurso(Curso[] curso) {
		this.curso = curso;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
