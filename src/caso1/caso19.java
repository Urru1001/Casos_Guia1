package caso1;
import java.util.Scanner;
public class caso19 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese Lado 1 : ");
		int lado1 = sc.nextInt();
		
		System.out.print("Ingrese Lado 2 : ");
		int lado2 = sc.nextInt();
		
		System.out.print("Ingrese Lado 3 : ");
		int lado3 = sc.nextInt();
		
		int perimetro = lado1 + lado2 + lado3;
		
		System.out.println("==========RESULTADOS==========");
		System.out.println("Perimetro del triangulo: " + perimetro);

	}

}
