package caso1;
import java.util.Scanner;
public class caso9 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese Lado 1...: ");
		int lado1 = sc.nextInt();
		
		System.out.print("Ingrese Lado 2...: ");
		int lado2 = sc.nextInt();
		
		int area = lado1 * lado2;
		int perimetro = (lado1 * 2) + (lado2 * 2);
		
		System.out.println("==========RESULTADOS==========");
		System.out.println("Área del rectangulo......: " + area);
		System.out.println("Perimetro del rectangulo.: " + perimetro);

	}

}
