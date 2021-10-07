package ar.edu.unlam.PB2Examen;

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

	public void agregarCalifacion(Calificacion calificacion) {
		this.calificaciones[this.calificaciones.length] = calificacion;
	}
}
