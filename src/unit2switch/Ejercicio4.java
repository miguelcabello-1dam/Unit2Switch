package unit2switch;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Escribe un algoritmo para sumar dos tiradas de un dado de seis caras que tiraría el usuario. El algoritmo pregunta al usuario cuánto ha sacado en la primera tirada y el usuario le dará esa información pero en formato cadena (“UNO”, “DOS” … “SEIS”). Después el algoritmo volverá a preguntar al usuario cuánto ha sacado en la segunda tirada y el usuario también dará esa información en formato cadena. Por último, el algoritmo mostrará por pantalla la suma de las dos tiradas en formato numérico.

		// se define el scanner
		Scanner sc = new Scanner(System.in);
		
		// variable donde se almacena la primera tirada como int
		String tirada1Cadena;
		// variable donde se almacena la segunda tirada como int
		String tirada2Cadena;
		int tirada1Num;
		int tirada2Num;
		
		
		// se pide que se introduzca la primera tirada
		System.out.println("Introduce tu primera tirada, sin numeros: ");
		// se guarda en la variable tirada1Cadena
		tirada1Cadena = sc.next();
		// se pide que se introduzca el segundo numero
		System.out.println("Introduce tu segunda tirada, sin numeros: ");
		// se guarda en la variable tirada2Cadena
		tirada2Cadena = sc.next();
		
		switch(tirada1Cadena) {
			case "UNO", "uno" -> { tirada1Num = 1; }
			case "DOS", "dos" -> { tirada1Num = 2; }
			case "TRES", "tres" -> { tirada1Num = 3; }
			case "CUATRO", "cuatro" -> { tirada1Num = 4; }
			case "CINCO", "cinco" -> { tirada1Num = 5; }
			case "SEIS", "seis" -> { tirada1Num = 6; }
			default -> { tirada1Num = 0; }
		}
		
		switch(tirada2Cadena) {
			case "UNO", "uno" -> { tirada2Num = 1; }
			case "DOS", "dos" -> { tirada2Num = 2; }
			case "TRES", "tres" -> { tirada2Num = 3; }
			case "CUATRO", "cuatro" -> { tirada2Num = 4; }
			case "CINCO", "cinco" -> { tirada2Num = 5; }
			case "SEIS", "seis" -> { tirada2Num = 6; }
			default -> { tirada2Num = 0; }
		}
		
		if (tirada1Num == 0 || tirada2Num == 0) {
			System.out.println("Alguna de las tiradas o ambas no han sido validas");
		} else {
			System.out.println("Has sacado un " + tirada1Num + " y un " + tirada2Num + ", en total has sacado un " + (tirada1Num+tirada2Num));
		}
		
		// se cierra el scanner
		sc.close();

	}

}