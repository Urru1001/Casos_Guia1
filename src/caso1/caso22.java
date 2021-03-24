package caso1;
import java.util.Scanner;
public class caso22 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Nombre del alumno(a): ");
		String nombre = sc.nextLine();
		
		System.out.print("Nota 1: ");
		int n1 = sc.nextInt();
		
		System.out.print("Nota 2: ");
		int n2 = sc.nextInt();
		
		System.out.print("Nota 3: ");
		int n3 = sc.nextInt();
		
		float promedio = (float) ((n1 + 0.2) + (n2 + 0.3) + (n3 + 0.5));
		
		System.out.println("Alumno: " + nombre);
		System.out.println("Promedio del alumno: " + promedio);

	}

}
