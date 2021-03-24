package caso1;
import java.util.Scanner;

public class caso18 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese altura...: ");
		int altura = sc.nextInt();
		
		System.out.print("Ingrese base...: ");
		int base = sc.nextInt();
		
		int area = base * altura;
		
		System.out.println("==========RESULTADOS==========");
		System.out.println("Área del triangulo......: " + area);

	}

}
