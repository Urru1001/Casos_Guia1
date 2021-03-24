package caso1;
import java.util.Scanner;
public class caso14 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese numero: ");
		int n = sc.nextInt();
		
		int sumatoria = (n *(n + 1)) / 2;
		
		System.out.println("\n------RESULTADOS--------");
		System.out.println("Sumatoria..: " + sumatoria);

	}

}
