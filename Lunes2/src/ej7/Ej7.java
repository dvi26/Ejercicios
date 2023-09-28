package ej7;

import java.util.Scanner;

public class Ej7 {

	public static void main(String[] args) {
		double milimetros;
		double centimetros;
		double metros;
		Scanner sc = new Scanner(System.in);
		// Abro el scanner
		System.out.println("Introduzca el valor en milimetros: ");
		// System out para pregunttar por el valor en milimetros
		milimetros = sc.nextDouble();
		// milimetros = scanner para introducir el valor con el teclado
		System.out.println("Introduzca el valor en centimetros: ");
		// System out para pregunttar por el valor en centimetros
		centimetros = sc.nextDouble();
		// centimetros = scanner para introducir el valor con el teclado
		System.out.println("Introduzca el valor en metros: ");
		// System out para pregunttar por el valor en metros
		metros = sc.nextDouble();
		// metros = scanner para introducir el valor con el teclado
		double milimetrosc = milimetros/10; 
		// variable para pasar de milimteros a centimetros
		double metrosc = metros*100;
		// variable para pasar de metros a centimetros
		double suma = milimetrosc + metrosc+ centimetros;
		// suma de los centimetros puestos más los dos convertidos
		System.out.println("La suma en centimetros es: " + suma + "cm");
		// System out + variable suma para decir el valor total en centimetros
		sc.close();
		// Cierro el scanner

	}

}
