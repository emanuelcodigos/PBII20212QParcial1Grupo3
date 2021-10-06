package ar.edu.unlam.PB2Examen;

import java.util.Scanner;

public class InterfazEscuela {

	public static void main(String[] args) {
		
    System.out.println("Bienvenido");
		
		int opcion = 0;
		do {
			opcion = seleccionarOpcion();
			switch (opcion) {
			case 1:
				
				break;
			case 2: 
				
				break;
			case 3: 
				
				break;
			case 4: 
				
				break;
			case 5: 
				
				break;
			case 6:
				
				break;
			case 7: 
				
				break;
			case 8: 
				
				break;
			case 9:
				//salir 
				break;
			default:
				System.out.println("Opcion Invalida");
				break;
			}

		} while (opcion != 9);
		
		System.out.println("Hasta pronto!");
	}
	
	private static int seleccionarOpcion() {
		Scanner teclado = new Scanner(System.in);
		int opcionSeleccionada=0;
		
		System.out.println("************************");
		System.out.println("Menu de Escuela");
		System.out.println("1 - Crear un Alumno o Profesor");
		System.out.println("2 - Consultar los promedios por materia de un alumno"); 
		System.out.println("3 - Calificar alumno"); 
		System.out.println("4 - Ver materias de un curso");
		System.out.println("5 - Ver el mejor promedio de un curso");
		System.out.println("6 - Ver listado de cursos");
		System.out.println("7 - Ver Materias dictadas por un profesor");
		System.out.println("8 - Ver datos personales de una persona");
		System.out.println("9 - Salir");
		System.out.println("************************");
		System.out.println("Ingrese una opcion");
		
		opcionSeleccionada = teclado.nextInt();
		
		return opcionSeleccionada;
	}

}


