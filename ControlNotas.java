package ar.com.educationit.universidad.desafio.Java2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControlNotas {

    
	public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese la cantidad de alumnos a procesar: ");
		int cantidadAlumnos = scanner.nextInt();

		List<Alumno> alumnos = new ArrayList<>();

		for (int i = 0; i < cantidadAlumnos; i++) {
			System.out.println("Ingrese los datos del alumno " + (i + 1) + ":");
			System.out.print("Nombre: ");
			String nombre = scanner.next();
			System.out.print("Apellido: ");
			String apellido = scanner.next();
			
			System.out.print("Número de examen: ");
			int numeroExamen = scanner.nextInt();
			double nota;
			double notas = 0;
			for (int i1=1; i1<=numeroExamen; i1++) {
				
				do {
					System.out.print("Nota: ");
			        nota = scanner.nextDouble();
			        if (nota >= 0 && nota <= 10) {
			            break;
			        } else {
			            System.out.println("Nota invalida");
			            System.out.println("Nota entre 0 y 10: ");
			        }
			    } while (true);
				notas = nota + i1;
			}
				
			
			Alumno alumno = new Alumno(nombre, apellido, numeroExamen, notas, notas);
			alumnos.add(alumno);
		}

		scanner.close();

		System.out.println("\nListado de información:");
		System.out.println("1- Alumno/s con la calificación más alta:");
		imprimirAlumnos(obtenerAlumnosConCalificacionMasAlta(alumnos));

		System.out.println("2- Alumno/s con la calificación más baja:");
		imprimirAlumnos(obtenerAlumnosConCalificacionMasBaja(alumnos));

		System.out.println("3- Alumnos que promocionan:");
		imprimirAlumnos(obtenerAlumnosQuePromocionan(alumnos));

		System.out.println("4- Alumnos que deben recursar la materia:");
		imprimirAlumnos(obtenerAlumnosQueDebenRecursar(alumnos));
	}

	

	public static List<Alumno> obtenerAlumnosConCalificacionMasAlta(List<Alumno> alumnos) {
		List<Alumno> alumnosConCalificacionMasAlta = new ArrayList<>();
		double maximaNota = -1;

		for (Alumno alumno : alumnos) {
			if (alumno.getNota() > maximaNota) {
				maximaNota = alumno.getNota();
				alumnosConCalificacionMasAlta.clear();
				alumnosConCalificacionMasAlta.add(alumno);
			} else if (alumno.getNota() == maximaNota) {
				alumnosConCalificacionMasAlta.add(alumno);
			}
		}

		return alumnosConCalificacionMasAlta;
	}

	public static List<Alumno> obtenerAlumnosConCalificacionMasBaja(List<Alumno> alumnos) {
		List<Alumno> alumnosConCalificacionMasBaja = new ArrayList<>();
		double minimaNota = 11;

		for (Alumno alumno : alumnos) {
			if (alumno.getNota() < minimaNota) {
				minimaNota = alumno.getNota();
				alumnosConCalificacionMasBaja.clear();
				alumnosConCalificacionMasBaja.add(alumno);
			} else if (alumno.getNota() == minimaNota) {
				alumnosConCalificacionMasBaja.add(alumno);
			}
		}

		return alumnosConCalificacionMasBaja;
	}

	public static List<Alumno> obtenerAlumnosQuePromocionan(List<Alumno> alumnos) {
		List<Alumno> alumnosQuePromocionan = new ArrayList<>();

		for (Alumno alumno : alumnos) {
			if (alumno.getPromedio() >= 7) {
				alumnosQuePromocionan.add(alumno);
			}
		}

		return alumnosQuePromocionan;
	}

	public static List<Alumno> obtenerAlumnosQueDebenRecursar(List<Alumno> alumnos) {
		List<Alumno> alumnosQueDebenRecursar = new ArrayList<>();

		for (Alumno alumno : alumnos) {
			if (alumno.getPromedio() < 7) {
				alumnosQueDebenRecursar.add(alumno);
			}
		}

		return alumnosQueDebenRecursar;
	}

	public static void imprimirAlumnos(List<Alumno> alumnos) {
		for (Alumno alumno : alumnos) {
			System.out.println(alumno);
		}
		System.out.println();
	}

}
