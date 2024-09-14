package first;
//TODO: Investigar por que el operador 16 % 3 dio 1;
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
		System.out.println(a); // 1
		a ++;
		System.out.println(a); // 2
		a --;
		System.out.println(a); // 1
	}

}
