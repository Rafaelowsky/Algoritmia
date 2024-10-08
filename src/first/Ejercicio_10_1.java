package first;

public class Ejercicio_10_1 {
	public static void main(String[] args) {
		int a, b;
		a = 3; // a = 3
		System.out.println("a = " + a); 
		b = a + 5; // b = 8
//		System.out.println("a = " + a + " y b = " + b);
		System.out.printf("a = %d y b = %d%n", a, b);
		a = 7; // a = 7
		System.out.printf("a = %d y b = %d%n", a, b);
		// el valor de b no cambia porque ya fue asignado
		// anteriormente y el programa se ejecuta secuencialmente
	}
}
