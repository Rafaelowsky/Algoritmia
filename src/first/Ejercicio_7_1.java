package first;

import java.util.Scanner;

public class Ejercicio_7_1 {
	public static void main(String[] args) {
		
		System.out.println();
		Scanner console = new Scanner(System.in);
		System.out.println("Teclea la temperatura: ");
		double temp = console.nextDouble();
		console.nextLine();
		
		if (temp < 2) {
			System.out.println("Riesgo de Hielo!!!!");
		}	else {
			System.out.println("Todo esta bien :)");
		}
		
		console.close();
	}
}
