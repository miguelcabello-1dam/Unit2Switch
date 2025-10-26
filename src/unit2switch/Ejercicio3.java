package unit2switch;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Escribe un algoritmo que le pida al usuario dos números. A continuación debe mostrar el siguiente menú por pantalla: A. SUMAR LOS NÚMEROS, B. RESTAR LOS NÚMEROS, C. MULTIPLICAR LOS NÚMEROS, D. DIVIDIR LOS NÚMEROS. Después, el algoritmo debe pedirle al usuario que seleccione una opción y que haga la operación que marca esa opción, mostrando por último el resultado de la operación elegida por el usuario. Si el usuario elige una opción incorrecta, el algoritmo se lo hace saber al usuario	y no haría nada.

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