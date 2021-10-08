package ar.edu.unlam.PB2Examen;

public class Materia {

	private NombreMateria nombreMateria;
	private String descripcion;
	private Integer codigoMateria;
	private String horario;

	public Materia(NombreMateria nombreMateria, String descripcion, Integer codigoMateria, String horario) {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoMateria == null) ? 0 : codigoMateria.hashCode());
		result = prime * result + ((nombreMateria == null) ? 0 : nombreMateria.hashCode());
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
		Materia other = (Materia) obj;
		if (codigoMateria == null) {
			if (other.codigoMateria != null)
				return false;
		} else if (!codigoMateria.equals(other.codigoMateria))
			return false;
		if (nombreMateria != other.nombreMateria)
			return false;
		return true;
	}

}
