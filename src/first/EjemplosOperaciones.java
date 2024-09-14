/* Este programa muestra ejemplos de como utilizar las operaciones dentro de JAVA */
package first;

// TODO: Agregar comentarios sobre que hace cada linea
public class EjemplosOperaciones {
	public static void main(String[] args) {
		
		int a = 3;
		int b = 5;
		
		int sum = a + b;
		int rest = a - b;
		int mult = a * b;
		int div = a / b;
		double div1 = a / b;
		double residuo = a % b; 
		
		System.out.println("La suma de " + a + " y " + b + " es: " + sum);
		System.out.println("La resta de " + a + " y " + b + " es: " + rest);
		System.out.println("La multiplicación de " + a + " y " + b + " es: " + mult);
		System.out.println("La division de " + a + " y " + b + " es: " + div);
		System.out.println("La division de " + a + " y " + b + " es: " + div1);
		System.out.println("La residuo de divir " + a + " y " + b + " es: " + residuo);

	}
}
