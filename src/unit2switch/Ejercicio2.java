package unit2switch;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Idear un programa que solicite al usuario un número comprendido entre 1 y 7, correspondiente a un día de la semana. Se debe mostrar el nombre del día de la semana al que corresponde. Por ejemplo, el número 1 corresponde a “Lunes” y el 6 a “Sábado”.
		
		// se define el scanner
		Scanner sc = new Scanner(System.in);
		
		// variable donde se almacena el num como int
		int num;
		// variable donde se almacena el dia de la semana como string
		String diasemana;
		
		// se pide que se introduzca el numero
		System.out.println("Introduce num del 1 al 7: ");
		// se guarda en la variable num
		num = sc.nextInt();
		
		switch(num) {
			case 1 -> {
				diasemana = "Lunes";
			}
			case 2 -> {
				diasemana = "Martes";
			}
			case 3 -> {
				diasemana = "Miercoles";
			}
			case 4 -> {
				diasemana = "Jueves";
			}
			case 5 -> {
				diasemana = "Viernes";
			}
			case 6 -> {
				diasemana = "Sabado";
			}
			case 7 -> {
				diasemana = "Domingo";
			}
			default -> {
				diasemana = "error";
				System.out.println("Numero fuera de rango");
			}
		}
		
		System.out.println("Has dicho " + num + ", es " + diasemana);
		
		// se cierra el scanner
		sc.close();

	}

}