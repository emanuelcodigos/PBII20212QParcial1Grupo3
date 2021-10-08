package ar.edu.unlam.PB2Examen;

import java.util.Arrays;

public class Alumno extends Persona {
	static private Integer numero_legajo=1;
	//Existen 9 materias en el ENUM, por eso 9 maximas. 
	static final private Integer CANTIDAD_MAXIMA_CALIFIACIONES = 9;
	private Integer legajo;
	private boolean estado;
	private Integer inasistencias;
	private Calificacion[] calificaciones;  
	
	public Alumno(String nombre,String apellido,Integer dni,String mail, Telefono telefono) {
		super(nombre,apellido,dni,mail,telefono);
		this.legajo=numero_legajo;	
		this.calificaciones = new Calificacion[CANTIDAD_MAXIMA_CALIFIACIONES];
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

	public Calificacion[] getCalificaciones() {
		return calificaciones;
	}
	
	public Calificacion getCalificacion(NombreMateria mat) {

		for (int i = 0; i < calificaciones.length; i++) {
			
			if(calificaciones[i] != null) {
				if(calificaciones[i].getMateria().equals(mat.toString())) {
					return calificaciones[i];
				}
			}
		}
		return null;
		
	}
	
	public Boolean agregarCalificacion(Calificacion calificacion) {
		
		for (int i = 0; i < calificaciones.length; i++) {

			if (calificaciones[i] == null && calificaciones.length <= CANTIDAD_MAXIMA_CALIFIACIONES) {
				calificaciones[i] = calificacion;
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Alumno: legajo=" + getLegajo() + ", nombre=" + getNombre() + ", apellido="
				+ getApellido() + ", dni=" + getDni();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((legajo == null) ? 0 : legajo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Alumno other = (Alumno) obj;
		if (legajo == null) {
			if (other.legajo != null)
				return false;
		} else if (!legajo.equals(other.legajo))
			return false;
		return true;
	}
	
}












