package ej8;

import java.util.Scanner;

public class Ej8 {

	public static void main(String[] args) {
		double importeI;
		double importeA;
		double importeT;
		double entradasI;
		double entradasA;
		double operación;
		double descuento;
		final double infantiles = 15.50;
		final double adultos = 20;
		// Declaro las variables
		Scanner sc = new Scanner(System.in);
		// Abro el scanner
		System.out.println("Introduzca la cantidad de entradas de adulto: ");
		// System out para pregunttar por la cantidad de entradas de adulto
		entradasA = sc.nextDouble();
		// entradasA = scanner para introducir el valor con el teclado
		System.out.println("Introduzca la cantidad de entradas infantiles: ");
		// System out para pregunttar por la cantidad de entradas infantiles
		entradasI = sc.nextDouble();
		// entradasI = scanner para introducir el valor con el teclado
		importeI = entradasI * infantiles;
		// operación para calcular el importe solo de entradas infantiles totales
		importeA = entradasA * adultos;
		// operación para calcular el importe solo de entradas de adulto totales
		importeT = importeA + importeI;
		// operación para calcular el importe total
		operación = (importeT*5)/100;
		// operación del descuento del 5%
		descuento = importeT - operación;
		// operación para quitarle ese 5% al importe total
		double condición= importeT>=100?descuento:importeT;
		// condición de que si el importe total es mayor o igual a 100 euros, se l
		System.out.println("El importe total es: " + condición);
		// system out + condición para decir cuanto es el improte total final
		sc.close();
		// Cierro el scanner

	
		
		
	}

}
