package ej2;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		int entero;
		Scanner sc = new Scanner(System.in);
		// Abro el scanner
		System.out.println("Introduzca un número entero: ");
		// System out para preguntar por el número
		entero = sc.nextInt();
		// entero = scanner para introducir el número con el teclado
		double resto =(entero %= 7);
		// %= para el resto de la división del número entero entre 7
		double resultado = 7- resto;
		// Condición para averiguar cuanto hay que sumarle al número que no sea multiplo de 7
		double a = (resto == 0?entero:resultado);
		// Condición de que si el resto es igual a 0, da el número entero inicial, si no se hace la condición anterior
		System.out.println("Hay que sumarle: " + a);
		// Sytem out + la condición anterior para decir cuanto hay que sumar si el numero no es multiplo
		sc.close();
		// Cerramos el scanner
		
		

	}

}
