/* Este programa muestra ejemplos de como utilizar las operaciones dentro de JAVA */
package first;

public class EjemplosOperaciones {
	public static void main(String[] args) {
		
		int a = 3;
		int b = 5;
		
		int sum = a + b; // operador para sumar
		int rest = a - b; // operador para restar
		int mult = a * b; // operador para multiplicar
		int div = a / b; // operador para dividir (division de enteros)
		double div1 = a / b; //operador para dividir (division de con numeros decimales)
		double residuo = a % b; // operador para obtener el residuo de una division
		
		System.out.println("La suma de " + a + " y " + b + " es: " + sum);
		System.out.println("La resta de " + a + " y " + b + " es: " + rest);
		System.out.println("La multiplicación de " + a + " y " + b + " es: " + mult);
		System.out.println("La division de " + a + " y " + b + " es: " + div);
		System.out.println("La division de " + a + " y " + b + " es: " + div1);
		System.out.println("La residuo de dividir " + a + " y " + b + " es: " + residuo);

	}
}
