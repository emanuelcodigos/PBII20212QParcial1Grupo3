package ar.edu.unlam.PB2Examen;

public class Escuela {

	private String nombre;
	private Curso[] cursos;
	
	public Escuela(String nombre, Curso[] cursos) {
		this.nombre = nombre;
		this.cursos = cursos;
	}
	
	public Escuela(String nombre, Integer cantidadCursos) {
		this.nombre = nombre;
		this.cursos = new Curso[cantidadCursos];
	}
	
	public Curso buscarUnCurso(Integer codigoCurso) {
		
		for(int i = 0; i < cursos.length; i++) {
			
			if(cursos[i] != null) {
				if(cursos[i].getCodigoDelCurso().equals(codigoCurso)) {
					return cursos[i];
				}
			}
		}
       return null;
	}
	
	public Curso buscarUnCurso(Curso curso) {
		for (int i= 0; i < cursos.length; i++) {
			if(cursos[i] != null) {
				if(cursos[i].equals(curso)) {
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

	
	
	
	
	
	
	
	
	
}
