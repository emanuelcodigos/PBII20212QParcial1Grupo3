package ar.edu.unlam.PB2Examen;

import static org.junit.Assert.*;

import org.junit.Test;

public class Pruebas {

	@Test
	public void queSePuedaCalcularElPromedioDeLasNotas() {
		
	  Calificacion nota = new Calificacion();
	  
	  nota.setNotaUno(9.0);
	  nota.setNotaDos(8.0);
	  nota.setNotaTres(5.5);
	  
	  Double esperado = 7.5;
	  nota.calcularPromedio();
	  
	  assertEquals(esperado, nota.getPromedio());
		
	}
	
	
}















