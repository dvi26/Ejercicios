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
		// System out para pregunttar por el valor de la longitud
		longitudm = sc.nextDouble();
		// longitudm = scanner para introducir la longitud con el teclado
		longitudcm = longitudm * 100;
		// convertir de m a cm
		longitudcmE = (int)longitudcm;
		// convertir de double a int para sacar la parte entera
		System.out.println("La longitud en centimetros es de: " + longitudcmE + "cm");
		// system out + longitudcmE para decir cuanto es la longitud en cm
		sc.close();
		

	}

}
