package ar.edu.unlam.PB2Examen;

public class Calificacion {
	
	private Double notaUno;
	private Double notaDos;
	private Double notaTres;
	private Double promedio;
	private Boolean estado;
	
	public Calificacion() {
		this.notaUno = 0.0;
		this.notaUno = 0.0;
		this.notaUno = 0.0;
	}
	
	public Calificacion(Double notaUno, Double notaDos, Double notaTres) {
		this.notaUno = notaUno;
		this.notaDos = notaDos;
		this.notaTres = notaTres;
		calcularPromedio();
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

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
	

}
