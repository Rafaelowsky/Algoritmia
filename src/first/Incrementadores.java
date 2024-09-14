// Programa para diferencias los incrementadores antes y después
package first;

// TODO: comentar el codigo y hacer las mismas operaciones pero con el decrementador --
public class Incrementadores {
	public static void main(String[] args) {
		int y = 4;
		int z = ++y * 2;
		System.out.println(z);
		
		y = 4;
		z = y++ * 2;
		System.out.println(z);
	}
}
