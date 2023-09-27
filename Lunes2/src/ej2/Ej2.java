package ej2;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		int entero;
		Scanner sc = new Scanner(System.in);
		// Abro el scanner
		System.out.println("Introduzca un número decimal: ");
		// System out para preguntar por el número
		entero = sc.nextInt();
		double solución = 2;
		double xd =(solución %= 7);
		System.out.println("Introduzca un número decimal: " + xd);
		

	}

}
