package ej4;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		double base;
		double altura;
		double area;
		// Declaro las variables
		Scanner sc = new Scanner(System.in);
		// Abro el scanner
		System.out.println("Introduzca la base: ");
		// System out para pregunttar por la base
		base = sc.nextDouble();
		// base = scanner para introducir la base con el teclado
		System.out.println("Introduzca la altura: ");
		// System out para pregunttar por la altura
		altura = sc.nextDouble();
		// base = scanner para introducir la altura con el teclado
		area = (base*altura)/2;
		// Fórmula del área
		System.out.println("El área es: " + area);
		// System out + variable area para decir cuanto es el área
		sc.close();
		// Cierro el scanner
		
	}

}
