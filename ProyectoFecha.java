package ar.com.educationit.universidad.desafioJava1;

import java.util.Scanner;

public class ProyectoFecha {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
        int d, m, a;

       
        System.out.println("Ingrese una fecha: ");
        System.out.print("día: ");
        d = teclado.nextInt();
        System.out.print("mes: ");
        m = teclado.nextInt();
        System.out.print("año: ");
        a = teclado.nextInt();

        
        Fecha fecha = new Fecha(d,m,a);

        if (fecha.fechaCorrecta()) { 

           
            System.out.println("Fecha ingresada: " + fecha);

  
        }else { 
            System.out.println("Fecha no válida");
        }
        teclado.close();
    }

	}


