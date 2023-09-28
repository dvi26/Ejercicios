package ej6;

import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		int segundos;
		int horas;
		int minutos;
		int restom;
		int restoh;
		// Decllaro las variables
		Scanner sc = new Scanner(System.in);
		// Abro el scanner
		System.out.println("Introduzca la cantidad de segundos: ");
		// System out para pregunttar por la cantidad de segundos
		segundos = sc.nextInt();
		// segundos = scanner para introducir con el teclado los segundos
		horas = segundos/3600;
		// segundos/3600 para tener las horas
		restoh = segundos % 3600;
		// % para el resto de la división
		minutos = restoh/60;
		// restoh/60 para obtener los minutos
		restom = restoh % 60;
		// restoh % 60 para obtener el resto de la división, siendo este los segundos
		System.out.println("La cantidad de segundos es: "  + segundos + " segundos");
		// System out + segundos para indicar los segundos
		System.out.println("Esos segundos en minutos son: " + minutos + " minutos y " + restom+ " segundos");
		// System out + miinutoos para indicar los minutos y segundos
		System.out.println("Esos segundos en horas son: " + horas + " horas, " + minutos + " minutos y " + restom + " segundos" );
		// System out + horas para indicar las horas, minutos y segundos
		sc.close();
		// Cierro el scanner

		
	}

}
