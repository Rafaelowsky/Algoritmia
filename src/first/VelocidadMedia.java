// Este programa deduce la velocidad media con la entrada de
// distancia y tiempo.

package first;

import java.util.Scanner;

public class VelocidadMedia {
	public static void main(String[] args) {
	
		//Adquisión de variables
		Scanner console = new Scanner(System.in);
		System.out.println("¿Cual fue la distancia recorrida? escribelo en kilometros");
		int distancia = console.nextInt();
		console.nextLine();
		System.out.println("¿En cuanto tiempo? escribelo en minutos");
		int tiempo = console.nextInt();
		console.nextLine();
		console.close();
		
		// Operación para obtener velocidad media
		double resultado = ((double)distancia) / (tiempo / 60); 
		System.out.printf("Su velocidad media fue de: %.1f", resultado);
	}
}
