package first;

import java.util.Scanner;

public class Ejercicio_10_3 {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Dame el valor 1: ");
		double valor1 = console.nextDouble();
		console.nextLine();
		System.out.println("Dame el valor 2: ");
		double valor2 = console.nextDouble();
		console.nextLine();
		System.out.println("Valor 1 = " + valor1 + " Valor 2 = " + valor2);
		console.close();
	}
}
