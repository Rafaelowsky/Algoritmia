// Programa para diferencias los incrementadores antes y después
package first;

public class Incrementadores {
	public static void main(String[] args) {
		
		int y = 4;
		int z = ++y * 2; // En esta operacion el incrementador al estar antes, el aumento se realiza antes
	
		System.out.println(z); // 10
		
		int a = 4;
		int b = a++ * 2; // Al estar después se hace el aumento a la variable al final de la operacion
						 // sin tomar en cuenta su valor incrementado en la operación.
		
		System.out.println(a); // 5 
		System.out.println(b); // 8
		
		
		int y1 = 4;
		int z1 = --y1 * 2;
	
		System.out.println(z1); // 6
		
		int a1 = 4;
		int b1 = a1 -- * 2;
		
		System.out.println(a1); // 3 
		System.out.println(b1); // 8
	}
}
