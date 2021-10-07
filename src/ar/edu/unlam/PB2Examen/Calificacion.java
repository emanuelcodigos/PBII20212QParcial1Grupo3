package ar.edu.unlam.PB2Examen;

public class Calificacion {

	private Double notaUno;
	private Double notaDos;
	private Double notaTres;
	private Double promedio;
	private Alumno alumno;

	public Calificacion(Alumno alumno) {
		this.alumno = alumno;
		this.notaUno = 0.0;
		this.notaUno = 0.0;
		this.notaUno = 0.0;
	}

	public Calificacion(Double notaUno, Double notaDos, Double notaTres, Alumno alumno) {
		this.alumno = alumno;
		this.notaUno = notaUno;
		this.notaDos = notaDos;
		this.notaTres = notaTres;
		calcularPromedio();
	}
	
	public String ObtenerPromedioDelAlumno() {
		return "El alumno " + alumno.getNombre() + " "+ alumno.getApellido() + " tiene como promedio " + getPromedio() + " y la materia que cursa se ecuentra en el estado " + obtenerEstado();
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
		if(getPromedio()>= 7) {
			return true;
		}
		return false;
	}

	public Alumno getAlumno() {
		return alumno;
	}

}
