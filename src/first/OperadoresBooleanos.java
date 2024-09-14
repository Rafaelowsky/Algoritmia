// Programa que muestra el uso de los operadores booleanos

package first;

// TODO: Hacer que el programa funcione pidiendo valores y con estructura if
// 			investigar diferencias entre boolean y Boolean al momento de declarar variables

public class OperadoresBooleanos {
	public static void main(String[] args) {
		
		boolean voyANavegar;
		int humedad = 0;
		int viento = 0;
		
		voyANavegar = humedad == 0 && viento != 0;
		System.out.println("¿Voy a navegar? " + voyANavegar);
		
		boolean produccion;
		int viento1 = 0;
		int sol = 0;
		
		produccion = viento1 > 0 && sol != 0;
		System.out.println("¿Producción? " + produccion);
		
		boolean meQuedoEnCasa;
		
		meQuedoEnCasa =! voyANavegar;
		System.out.println(meQuedoEnCasa);
		
		
	}
}
