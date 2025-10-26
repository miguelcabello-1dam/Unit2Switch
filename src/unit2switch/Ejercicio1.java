package unit2switch;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Pedir una nota entera de 0 a 10 y mostrarla de la siguiente forma: insuficiente (de 0 a 4), suficiente (5), bien (6), notable (7 y 8) y sobresaliente (9 y 10).
		
		// se define el scanner
		Scanner sc = new Scanner(System.in);
		
		// variable donde se almacena la nota como int
		int notanum;
		// variable donde se almacena la descripcion de la nota como string
		String notadesc;
		
		// se pide que se introduzca la nota
		System.out.println("Introduce la nota del 1 al 10: ");
		// se guarda en la variable notanum
		notanum = sc.nextInt();
		
		switch(notanum) {
			case 0, 1, 2, 3, 4 -> {
				notadesc = "insuficiente";
			}
			case 5 -> {
				notadesc = "suficiente";
			}
			case 6 -> {
				notadesc = "bien";
			}
			case 7, 8 -> {
				notadesc = "notable";
			}
			case 9, 10 -> {
				notadesc = "sobresaliente";
			}
			default -> {
				notadesc = "error";
				System.out.println("Nota fuera de rango");
			}			
		}
		
		System.out.println("Has sacado un " + notanum + ": " + notadesc);
		
		// se cierra el scanner
		sc.close();

	}

}