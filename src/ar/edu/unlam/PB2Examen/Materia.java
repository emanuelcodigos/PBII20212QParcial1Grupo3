package ar.edu.unlam.PB2Examen;

public class Materia {

	private NombreMateria nombreMateria;
	private String descripcion;
	private Integer codigoMateria;
	private String horario;

	public Materia(NombreMateria nombreMateria, String descripcion, Integer codigoMateria, String horario) {
		super();
		this.nombreMateria = nombreMateria;
		this.descripcion = descripcion;
		this.codigoMateria = codigoMateria;
		this.horario = horario;
	}
	
	public NombreMateria getTitulo() {
		return nombreMateria;
	}
	
	public void setTitulo(NombreMateria nombreMateria) {
		this.nombreMateria = nombreMateria;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Integer getCodigoMateria() {
		return codigoMateria;
	}

	public void setCodigoMateria(Integer codigoMateria) {
		this.codigoMateria = codigoMateria;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

}
