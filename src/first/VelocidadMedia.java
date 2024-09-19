// Este programa deduce la velocidad media con la entrada de
// distancia y tiempo.

package first;

import java.util.Scanner;

public class VelocidadMedia {
	public static void main(String[] args) {
	
		Scanner console = new Scanner(System.in);
		System.out.println("¿Cual fue la distancia recorrida?");
		int distancia = console.nextInt();
		console.nextLine();
		System.out.println("¿En cuanto tiempo? escribelo en minutos");
		int tiempo = console.nextInt();
		console.nextLine();
		console.close();
		
		double resultado = distancia/(tiempo*60);
		System.out.printf("Su velocidad media fue de: %.2f", resultado);
		// TODO: Arreglar porque el resultado sale en 0.00
	}
}
