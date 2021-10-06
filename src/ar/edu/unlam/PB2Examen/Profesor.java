package ar.edu.unlam.PB2Examen;

public class Profesor extends Persona {
	private String titulo;
	private Integer salario;
	private Materia materiaDictada;
	
	public Profesor(String nombre,String apellido,Integer dni,String mail, Telefono telefono,String titulo,Integer salario, Materia materiaDictada) {
		super(nombre,apellido,dni,mail,telefono);
		this.titulo=titulo;
		this.salario=salario;
		this.materiaDictada=materiaDictada;
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

	public Materia getMateriaDictada() {
		return materiaDictada;
	}

	public void setMateriaDictada(Materia materiaDictada) {
		this.materiaDictada = materiaDictada;
	}
}
