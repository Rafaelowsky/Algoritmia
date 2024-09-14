package first;
//TODO: Agregar los valores que aparecen en consola para cada uno de las operaciones
public class OperadoresAsignacionConAritmetico {
	public static void main(String[] args) {
		int a = 10;
		
		a += 5;
		System.out.println(a); // 15
		a -= 3;
		System.out.println(a); // 12
		a *= 7;
		System.out.println(a); // 84
		a /= 5;
		System.out.println(a); // 16
		a %= 3;
		System.out.println(a); // 3
		a ++;
		System.out.println(a); // 4
		a --;
		System.out.println(a); // 3
	}

}
