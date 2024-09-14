/* Programa para mostrar adquision de datos */
package first;

import java.util.Scanner;

public class AdquisionDeDatos {
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("¿Precio bruto del articulo?");
		double precioBruto = console.nextDouble(); // Método para obtener flotantes
		console.nextLine();
		System.out.println("¿Cantidad de articulos?");
		int cantidad = console.nextInt(); // Método para obtener enteros
		console.nextLine();
		console.close();
		
		System.out.printf("El precio bruto %.2f", precioBruto);
		System.out.printf("Cantidad de articulo: %d", cantidad);
		
	}
}
