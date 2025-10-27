package unit2switch;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Pedir una nota entera de 0 a 10 y mostrarla de la siguiente forma: insuficiente (de 0 a 4), suficiente (5), bien (6), notable (7 y 8) y sobresaliente (9 y 10).
		
		// se define el scanner
		Scanner sc = new Scanner(System.in);
		
		// variable donde se almacena la nota como int
		int notaNum;
		// variable donde se almacena la descripcion de la nota como string
		String notaDesc;
		
		// se pide que se introduzca la nota
		System.out.println("Introduce la nota del 1 al 10: ");
		// se guarda en la variable notanum
		notaNum = sc.nextInt();
		
		switch(notaNum) {
			case 0, 1, 2, 3, 4 -> { notaDesc = "insuficiente"; }
			case 5 -> { notaDesc = "suficiente"; }
			case 6 -> { notaDesc = "bien"; }
			case 7, 8 -> { notaDesc = "notable"; }
			case 9, 10 -> { notaDesc = "sobresaliente"; }
			default -> { 
				notaDesc = "error"; 
				System.out.println("Nota fuera de rango"); 
			}			
		}
		
		System.out.println("Has sacado un " + notaNum + ": " + notaDesc);
		
		// se cierra el scanner
		sc.close();

	}

}