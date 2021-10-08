package ar.edu.unlam.PB2Examen;

public class Profesor extends Persona {
	private String titulo;
	private Integer salario;
	private Integer legajo;

	public Profesor(String nombre, String apellido, Integer dni, String mail, Telefono telefono, String titulo,
			Integer salario) {
		super(nombre, apellido, dni, mail, telefono);
		this.titulo = titulo;
		this.salario = salario;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getSalario() {
		return salario;
	}

	public void setSalario(Integer salario) {
		this.salario = salario;
	}

	public Integer getLegajo() {
		return legajo;
	}

	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}

}
