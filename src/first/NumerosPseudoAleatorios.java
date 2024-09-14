package first;

import java.util.Random;

public class NumerosPseudoAleatorios {
	public static void main(String[] args) {
		Random r = new Random(); // El método new Random genera una key para poder generar números pseudo aleatorios
		int nota = r.nextInt(21); // Este comando ya nos genera un número dentro de 0 y 21
		
		System.out.println(nota);
	}
}
