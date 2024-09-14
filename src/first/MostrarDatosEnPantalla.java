/* 
 * Este programa muestra como son mostrados los datos en pantalla utilizando
 * diferentes métodos como print, printf, println
 *
 */
package first;

public class MostrarDatosEnPantalla {
	public static void main(String[] args) {
		int valor = 1492;
		String nombre = "Cristobal Colon";
		double precisionGrabado = 0.000001;
		System.out.print("a"); // Este print es para poder imprimir en pantalla pero sin el salto de linea 
		System.out.println("En " + valor + " fue descubierto Ámerica por " + nombre); // Aqui son los valores concatenados
		System.out.printf("En %d fue descubierto Ámerica por %s%n", valor, nombre); // Aqui es una forma de imprimir los datos pero con printf
		System.out.printf("El valor %d equivale a %x en base 16%n", valor, valor);
		System.out.printf("El valor de Pi es %.2f%n", Math.PI); // %.2f es para mostrar la cantidad de decimales que necesitas
		System.out.printf("La precision de grabado de los procesadores es %e m%n", precisionGrabado);
	}
}
