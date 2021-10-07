package ar.edu.unlam.PB2Examen;

import static org.junit.Assert.*;

import org.junit.Test;

public class Pruebas {

	@Test
	public void queSePuedaCalcularElPromedioDeLasNotas() {
	  Telefono nuevoTelefono = new Telefono(54, 011, 56325632);
	  Alumno nuevoAlumno = new Alumno("Gabriel", "Angione", 38888888, "gabito@gmail.com", nuevoTelefono);
	  
	  
	  
	  Calificacion nota = new Calificacion(nuevoAlumno);
	  
	  nota.setNotaUno(9.0);
	  nota.setNotaDos(8.0);
	  nota.setNotaTres(5.5);
	  
	  Double esperado = 7.5;
	  nota.calcularPromedio();
	  
	  assertEquals(esperado, nota.getPromedio());
		
	}
	
	
}















