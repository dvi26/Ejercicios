package ej10;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		double longitudm;
		double longitudcm;
		int longitudcmE;
		// Declaro las variables
		Scanner sc = new Scanner(System.in);
		// Abro el scanner
		System.out.println("Introduzca la longitud en metros: ");
		// System out para pregunttar por el valor de n1
		longitudm = sc.nextDouble();
		longitudcm = longitudm * 100;
		longitudcmE = (int)longitudcm;
		

	}

}
