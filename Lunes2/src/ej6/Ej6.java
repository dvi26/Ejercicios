package ej6;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		double segundos;
		double horas;
		double minutos;
		// Decllaro las variables
		Scanner sc = new Scanner(System.in);
		// Abro el scanner
		System.out.println("Introduzca la cantidad de segundos: ");
		// System out para pregunttar por la cantidad de segundos
		segundos = sc.nextDouble();
		// segundos = scanner para introducir con el teclado los segundos
		minutos= segundos/60;
		// Divido los segundos entre 60 para calcular los minutos
		horas = minutos/60;
		// Divido los minutos entre 60 para calcular las horas
		System.out.println("La cantidad de segundos es: "  + segundos);
		// System out + segundos para indicar los segundos
		System.out.println("Esos segundos en minutos son: " + minutos);
		// System out + miinutoos para indicar los minutos
		System.out.println("Esos segundos en horas son: " + horas);
		// System out + horas para indicar las horas
		sc.close();
		// Cierro el scanner

	}

}
