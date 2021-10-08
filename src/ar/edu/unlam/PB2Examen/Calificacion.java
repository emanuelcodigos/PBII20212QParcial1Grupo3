package ar.edu.unlam.PB2Examen;

public class Calificacion {

	static private Integer ID = 1;

	private Integer id;
	private Double notaUno;
	private Double notaDos;
	private Double notaTres;
	private NombreMateria materia;

	public Calificacion(NombreMateria materia, Double notaUno, Double notaDos, Double notaTres) {
		this.materia = materia;
		this.notaUno = notaUno;
		this.notaDos = notaDos;
		this.notaTres = notaTres;
		this.id = ID;
		ID++;
	}

	public Integer getId() {
		return id;
	}

	public Double calcularPromedio() {
		return (notaUno + notaDos + notaTres) / 3;
	}

	public Double getNotaUno() {
		return notaUno;
	}

	public void setNotaUno(Double notaUno) {
		this.notaUno = notaUno;
	}

	public Double getNotaDos() {
		return notaDos;
	}

	public void setNotaDos(Double notaDos) {
		this.notaDos = notaDos;
	}

	public Double getNotaTres() {
		return notaTres;
	}

	public void setNotaTres(Double notaTres) {
		this.notaTres = notaTres;
	}

	public Boolean obtenerEstado() {
		if (calcularPromedio() >= 7) {
			return true;
		}
		return false;
	}

	public NombreMateria getMateria() {
		return materia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((materia == null) ? 0 : materia.hashCode());
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
		Calificacion other = (Calificacion) obj;
		if (materia != other.materia)
			return false;
		return true;
	}

}
