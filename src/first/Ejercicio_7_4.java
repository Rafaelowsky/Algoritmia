package first;

import java.util.Scanner;

public class Ejercicio_7_4 {
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		System.out.println("¿Que carne es ? (vacuno/cordero)");
		String tipoCarne = console.nextLine();
		System.out.println("¿Cuantos gramos de carne vas a cocinar?");
		int gramos = console.nextInt();
		console.nextLine();
		System.out.println("¿En que término la quieres?");
		String termino = console.nextLine();
		
		if (tipoCarne.equals("cordero")) { 
			if (gramos == 400) {
				if (termino.equals("casi cruda")) {
					System.out.println("Tiene que cocinarla por 10 min.");
				} else if (termino.equals("al punto")){
					System.out.println("Tiene que cocinarla por 17 min.");
				} else if (termino.equals("bien cocida")){
					System.out.println("Tiene que cocinarla por 25 min.");
				}
			}
		} else if (tipoCarne.equals("vacuno")){
			if (gramos == 500) {
				if (termino.equals("casi cruda")) {
					System.out.println("Tiene que cocinarla por 15 min.");
				} else if (termino.equals("al punto")){
					System.out.println("Tiene que cocinarla por 25 min.");
				} else if (termino.equals("bien cocida")){
					System.out.println("Tiene que cocinarla por 40 min.");
				}
			}	
		}
		console.close();
	}
}
