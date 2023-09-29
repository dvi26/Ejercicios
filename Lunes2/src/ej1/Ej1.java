package ej1;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		double decimal;
		// Declaro la variable del número decimal a introducir
		Scanner sc = new Scanner(System.in);
		// Abro el scanner
		System.out.println("Introduzca un número decimal: ");
		// System out para preguntar por el número
		decimal = sc.nextDouble();
		// Scanner = decimal para que se pueda introducir el número con el teclado
		int entera = (int) decimal;
		// Convierto el double en int para tener solo la parte entera del número introducido
		double comprobación = entera + 0.5;
		// Creo variable a la que le sumo 0,5 a la parte entera para aprximar si la parte decimal es mayor o igual que la parte enter,5
		int aprox = (entera+1);
		// Creo variable que le sume 1 a la parte entera para la condicional
		int a= (comprobación <= decimal?aprox:entera);
		/* Creo variable condicional que dice que si la parte entera + 0,5 es menor 
		 * o igual que el numero decimal, da la variable aprox (+1), y si no es menor
		 * o igual de la parte entera truncada
		 */
		System.out.println("Su número redondeado es: " + a);
		// System out para dar el número redondeado más el condicional
		sc.close();
		// Cierro el scanner

	}

}
