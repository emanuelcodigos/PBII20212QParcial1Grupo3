package ar.edu.unlam.PB2Examen;

import java.util.Scanner;

public class InterfazEscuela {
    static private Escuela miEscuela = new Escuela("500", 10);
	public static void main(String[] args) {
		
   /* System.out.println("Bienvenido");
		
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
		
		System.out.println("Hasta pronto!");*/
		
		/*Telefono tel = new Telefono(054, 11, 123456789);
		Profesor profe = new Profesor("kiko", "zonaSur", 424242, "kiko@gmail.com", tel, "Profesor", 35000);
		Materia materia = new Materia(NombreMateria.PLASTICA, "Historia del antiguo Egipto", 145, "8:00 a 11:00 hs");
		
		Curso miCurso = new Curso(profe, NombreMateria.HISTORIA, "Historia del antiguo Egipto", 145, "8:00 a 11:00 hs");
		Curso miCurso1 = new Curso(profe, NombreMateria.CIENCIAS_SOCIALES, "descripcion Random", 80, "8:00 a 11:00 hs");
		Curso miCurso2 = new Curso(profe, NombreMateria.PROGRMACION, "PB2 en java", 200, "8:00 a 11:00 hs");
		
		
		
		Curso[] cursos = {miCurso, miCurso1, miCurso2};
		
		Escuela colegio = new Escuela("Escuela nro 500", cursos);
		
		Curso buscado = colegio.buscarUnCurso(miCurso);
		//System.out.println(buscado.getMateria().getTitulo());
		
		Alumno alUno = new Alumno("ema", "cisterna", 42340, "ema@gmaio.com", tel);
		Alumno alDos = new Alumno("Juani", "Gonzales", 85858, "juan@gmaio.com", tel);*/
		/*System.out.println(miCurso.inscribirAlumnoACurso(alDos));
		
		
		Alumno alBucado =  buscado.getAlumno(2);
		System.out.println(alBucado.getNombre());*/
		
		/*Calificacion nota = new Calificacion(NombreMateria.PLASTICA);
		Calificacion nota2 = new Calificacion(NombreMateria.BASE_DE_DATOS);
		
		alUno.agregarCalificacion(nota2);
		alUno.agregarCalificacion(nota);		
		
		Calificacion obtenid =  alUno.getCalificacion(NombreMateria.PLASTICA);
		System.out.println(obtenid.getNotaDos());
		
		crearUnAlumno();*/
	
		
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
	
	private static void crearUnAlumno() {
		
		Scanner teclado = new Scanner(System.in);
		Telefono tel = new Telefono(054, 11, 123456789);
		
		System.out.println("Escribe el nombre");
		String nombre = teclado.nextLine();
		System.out.println("Escribe el apellido");
		String apellido = teclado.nextLine();
		System.out.println("Escribe el E-mail");
		String mail = teclado.nextLine();
		System.out.println("Escribe el DNI");
		Integer dni = teclado.nextInt();
		
		Alumno alumno = new Alumno(nombre, apellido, dni, mail, tel);

	}
	
	
	private static void consultarPromediosPorMateriaDeUnAlumno() {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escribe el numero de legajo de Alumno");
		Integer idAlumno = teclado.nextInt();
		Alumno alumno = buscarAlumno(idAlumno);
		
		if(alumno != null) {
			Calificacion[] calificaciones = alumno.getCalificaciones(); 
			for(int i = 0; i < calificaciones.length; i++) {
				if(calificaciones[i] != null) {
					System.out.println(calificaciones[i].getMateria() + ": " + calificaciones[i].getPromedio());
				}
			}
			
		}else {
			System.out.println("No se encontro el alumno buscado");
		}
		
	}
	private static Alumno buscarAlumno(Integer idAlumno) {
		 
		Curso[] cursos = miEscuela.getCursos();
		
		for (int i = 0; i < cursos.length; i++) {
			
			if(cursos[i] != null) {
				
				if(cursos[i].getAlumno(idAlumno) != null) {
					
					return cursos[i].getAlumno(idAlumno); 
			    }
			}
		}
		return null;
		
	}
	
	
	private static void alumnosDeUnCurso(Integer idCurso) {
		
		Curso curso = miEscuela.buscarUnCurso(idCurso);
		
		if(curso != null) {
			Alumno[] alumnos = curso.getAlumnos();
			
			for(int i = 0; i < alumnos.length; i++) {
				if(alumnos[i] != null) {
					System.out.println((i + 1) +": "+ alumnos[i].getNombre()+ " "+alumnos[i].getApellido());
				}
			}
		}else {
			System.out.println("No se encontro el curso buscado");
		}
		
		
	}
	
}






















