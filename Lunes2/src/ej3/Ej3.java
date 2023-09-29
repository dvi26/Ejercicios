package ej3;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		int entero1;
		int entero2;
		// declaro las variables
		Scanner sc = new Scanner(System.in);
		// Abro el scanner
		System.out.println("Introduzca un número entero: ");
		// System out para preguntar por el número
		entero1 = sc.nextInt();
		// entero1 = scanner para introducir el número con el teclado
		System.out.println("Introduzca otro número entero: ");
		// System out para preguntar por el número
		entero2 = sc.nextInt();
		// entero2 = scanner para introducir el número con el teclado
		double resto =(entero1 %= entero2);
		// %= para el resto de la división del n1 entre n2
		double resultado = entero2- resto;
		// Condición para averiguar cuanto hay que sumarle al n1 que no sea multiplo de n2
		double a = (resto == 0?entero1:resultado);
		// Condición de que si el resto es igual a 0, da el número entero inicial, si no se hace la condición anterior
		System.out.println("Hay que sumarle: " + a);
		// Sytem out + la condición anterior para decir cuanto hay que sumar si el numero no es multiplo
		sc.close();
		// Cerramos el scanner

	}

}
