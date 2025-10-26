package unit2switch;
as
import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Escribe un algoritmo para sumar dos tiradas de un dado de seis caras que tiraría el usuario. El algoritmo pregunta al usuario cuánto ha sacado en la primera tirada y el usuario le dará esa información pero en formato cadena (“UNO”, “DOS” … “SEIS”). Después el algoritmo volverá a preguntar al usuario cuánto ha sacado en la segunda tirada y el usuario también dará esa información en formato cadena. Por último, el algoritmo mostrará por pantalla la suma de las dos tiradas en formato numérico.

		// se define el scanner
		Scanner sc = new Scanner(System.in);
		
		// variable donde se almacena el primer num como int
		int num1;
		// variable donde se almacena el segundo num como int
		int num2;
		// variable donde se almacena la eleccion como string
		String eleccion;
		
		// se pide que se introduzca el primer numero
		System.out.println("Introduce primer num: ");
		// se guarda en la variable num1
		num1 = sc.nextInt();
		// se pide que se introduzca el segundo numero
		System.out.println("Introduce segundo num: ");
		// se guarda en la variable num2
		num2 = sc.nextInt();
		
		System.out.println("Selecciona una opcion: ");
		System.out.println("A: SUMAR LOS NUMEROS");
		System.out.println("B: RESTAR LOS NUMEROS");
		System.out.println("C: MULTIPLICAR LOS NUMEROS");
		System.out.println("D: DIVIDIR LOS NUMEROS");
		eleccion = sc.next();
		
		
		switch(eleccion) {
			case "A", "a" -> {
				System.out.println("Has elegido sumar, " + num1 + " + " + num2 + " es: " + (num1+num2));
			}
			case "B", "b" -> {
				System.out.println("Has elegido restar, " + num1 + " - " + num2 + " es: " + (num1-num2));
			}
			case "C", "c" -> {
				System.out.println("Has elegido multiplicar, " + num1 + " * " + num2 + " es: " + (num1*num2));
			}
			case "D", "d" -> {
				System.out.println("Has elegido dividir, " + num1 + " / " + num2 + " es: " + (num1/num2));
			}
			default -> {
				System.out.println("Opcion no valida");
			}
		}
		
		// se cierra el scanner
		sc.close();

	}

}