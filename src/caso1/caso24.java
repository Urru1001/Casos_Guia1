package caso1;
import java.util.Scanner;
public class caso24 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("N�mero 1: ");
		int n1 = sc.nextInt();
		
		System.out.print("N�mero 2: ");
		int n2 = sc.nextInt();
		
		System.out.print("N�mero 3: ");
		int n3 = sc.nextInt();
		
		float op1 = (n1 * 0.2f) + (n2 * 0.2f);
		float op2 = (n3 * 1.6f) / 2;
		float op3 = (n1 + n2 + n3) * 0.92f;
		
		System.out.println("Operaci�n 1: " + op1);
		System.out.println("Operaci�n 2: " + op2);
		System.out.println("Operaci�n 3: " + op3);
		

	}

}
