package ar.edu.unlam.PB2Examen;

public class Materia {

	private NombreMateria titulo;
	private String descripcion;
	private Integer codigoMateria;
	private String horario;

	public Materia(Titulo titulo, String descripcion, Integer codigoMateria, String horario) {
		super();
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.codigoMateria = codigoMateria;
		this.horario = horario;
	}

	public Titulo getTitulo() {
		return titulo;
	}

	public void setTitulo(Titulo titulo) {
		this.titulo = titulo;
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
