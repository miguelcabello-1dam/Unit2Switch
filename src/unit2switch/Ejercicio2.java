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
		String diaSemana;
		
		// se pide que se introduzca el numero
		System.out.println("Introduce num del 1 al 7: ");
		// se guarda en la variable num
		num = sc.nextInt();
		
		switch(num) {
			case 1 -> { diaSemana = "Lunes"; }
			case 2 -> { diaSemana = "Martes"; }
			case 3 -> { diaSemana = "Miercoles"; }
			case 4 -> { diaSemana = "Jueves"; }
			case 5 -> { diaSemana = "Viernes"; }
			case 6 -> { diaSemana = "Sabado"; }
			case 7 -> { diaSemana = "Domingo"; }
			default -> {
				diaSemana = "error";
				System.out.println("Numero fuera de rango");
			}
		}
		
		System.out.println("Has dicho " + num + ", es " + diaSemana);
		
		// se cierra el scanner
		sc.close();

	}

}