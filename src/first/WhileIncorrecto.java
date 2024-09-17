package first;

import java.util.Scanner;

public class WhileIncorrecto {
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		System.out.println("Escriba la capital de Francia: ");
		String valorIntroducido = console.next();
		console.nextLine();
		
		while (valorIntroducido != "París") {
			if (valorIntroducido == "París") 
				System.out.println("Es correcto");
			else 
				System.out.println("Te equivocaste ):");
		}
		
	}
}
