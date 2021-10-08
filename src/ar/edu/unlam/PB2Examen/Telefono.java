package ar.edu.unlam.PB2Examen;

public class Telefono {

	private Integer codPais;
	private Integer codArea;
	private Integer numero;

	public Telefono(Integer codPais, Integer codArea, Integer numero) {
		this.codArea = codArea;
		this.codPais = codPais;
		this.numero = numero;
	}

	public long getTelefono() {
		return codPais + codArea + numero;
	}

	public Integer getCodPais() {
		return codPais;
	}

	public void setCodPais(Integer codPais) {
		this.codPais = codPais;
	}

	public Integer getCodArea() {
		return codArea;
	}

	public void setCodArea(Integer codArea) {
		this.codArea = codArea;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return codPais + " - " + codArea + " - " + numero;
	}

}
