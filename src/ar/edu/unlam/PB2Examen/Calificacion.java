package ar.edu.unlam.PB2Examen;

public class Calificacion {

	static private Integer ID = 1;
	
	private Integer id;
	private Double notaUno;
	private Double notaDos;
	private Double notaTres;
	private Double promedio;
	private NombreMateria materia;

	public Calificacion(NombreMateria materia) {
		this.materia = materia; 
		this.notaUno = 0.0;
		this.notaDos = 0.0;
		this.notaTres = 0.0;
		this.id = ID;
		ID++;
		
	}

	public Calificacion(NombreMateria materia,Double notaUno, Double notaDos, Double notaTres) {
		this.materia = materia; 
		this.notaUno = notaUno;
		this.notaDos = notaDos;
		this.notaTres = notaTres;
		calcularPromedio();
	}
	
	public Integer getId() {
		return id;
	}

	public void calcularPromedio() {
		promedio = (notaUno + notaDos + notaTres) / 3;
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

	public Double getPromedio() {
		return promedio;
	}

	public Boolean obtenerEstado() {
		if (getPromedio() >= 7) {
			return true;
		}
		return false;
	}

	public String getMateria() {
		return materia.toString();
	}

}
