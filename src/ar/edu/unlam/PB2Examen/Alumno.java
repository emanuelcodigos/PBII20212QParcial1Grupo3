package ar.edu.unlam.PB2Examen;

public class Alumno extends Persona {
	static private Integer numero_legajo=1;
	
	private Integer legajo;
	private boolean estado;
	private Integer inasistencias;
	
	public Alumno(String nombre,String apellido,Integer dni,String mail, Telefono telefono) {
		super(nombre,apellido,dni,mail,telefono);
		this.legajo=numero_legajo;
		numero_legajo++;
	}

	public Integer getLegajo() {
		return legajo;
	}

	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public Integer getInasistencias() {
		return inasistencias;
	}

	public void setInasistencias(Integer inasistencias) {
		this.inasistencias = inasistencias;
	}
}
