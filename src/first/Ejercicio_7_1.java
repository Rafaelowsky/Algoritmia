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
		}	else  if (temp >= 2 && temp < 15){
			System.out.println("Hace frío");
		}	else  if (temp >= 15 && temp < 30){
			System.out.println("Hace calor");
		}	else  if (temp >= 30){
			System.out.println("Demasiado calor");
		}
		
		console.close();
	}
}
