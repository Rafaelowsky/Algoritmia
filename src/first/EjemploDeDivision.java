// En este programa se ve los diferentes comportamientos entre divisiones
// con datos de tipo entero y double
package first;

public class EjemploDeDivision {
	public static void main(String[] args) {
		
		int a = 69;
		int b = 4;
		double c = 69;
		int d = 69;
		
		int intDiv = a / b;
		double doubleDivAB = a / b; 
		double doubleDivAD = a / d;
		double doubleDivCB = c / b;
		double doubleDivCD = c / d;
		int restoAB = a % b;
		
		System.out.println(intDiv);
		System.out.println(doubleDivAB);
		System.out.println(doubleDivAD);
		System.out.println(doubleDivCB);
		System.out.println(doubleDivCD);
		System.out.println(restoAB);
	}
}
