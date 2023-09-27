package ej5;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double x;
		double polinomio;
		// Declaro las variables
		Scanner sc = new Scanner(System.in);
		// Abro el scanner
		System.out.println("Introduzca el valor de a: ");
		// System out para pregunttar por a
		a = sc.nextDouble();
		// a = scanner para introducir la base con el teclado
		System.out.println("Introduzca el valor de b: ");
		// System out para pregunttar por b
		b = sc.nextDouble();
		// b = scanner para introducir la base con el teclado
		System.out.println("Introduzca el valor de c: ");
		// System out para pregunttar por c
		c = sc.nextDouble();
		// c = scanner para introducir la base con el teclado
		System.out.println("Introduzca el valor de x: ");
		// System out para pregunttar por x
		x = sc.nextDouble();
		// x = scanner para introducir la base con el teclado
		polinomio = (a*x*x) + (b*x) + c; 
		// Sustituyo las variables en el polinomio
		System.out.println("y vale: " + polinomio);
		// System out + polinomio para decir cuanto vale y
		sc.close();
		// Cierro el scanner
		
		
		

	}

}
