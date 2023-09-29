package ej9;

import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		double n1;
		double n2;
		boolean condición;
		// Declaro las variables
		Scanner sc = new Scanner(System.in);
		// Abro el scanner
		System.out.println("Introduzca un número: ");
		// System out para pregunttar por el valor de n1
		n1 = sc.nextDouble();
		// n1 = scanner para introducir el valor con el teclado
		System.out.println("Introduzca otro número: ");
		// System out para pregunttar por el valor de n2
		n2 = sc.nextDouble();
		// n2 = scanner para introducir el valor con el teclado
		condición = (n1==n2 && n2==n1);
		// condición para que si n1=n2 de true, pero de false si es al contrario
		System.out.println("¿Son ambos números iguales?: " + condición);
		// System out + condición para responder si ambos números son iguales
		sc.close();
		// Cierro el scanner
		

	}

}
