// Este programa es un ejemplo sobre como no utilizar la iteracione while
package first;

import java.util.Scanner;

public class WhileIncorrecto {
	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		System.out.println("Escriba la capital de Francia: ");
		String valorIntroducido = console.next();
		console.nextLine();
		
		while (!valorIntroducido.equals("París") ) {
			System.out.println("Te equivocaste, intentalo de nuevo:");
			System.out.println("¿Cual es la capital de Francia?");
			valorIntroducido = console.nextLine();
		}
		
		System.out.println("Bravo acertaste!");
		console.close();
	}
}
