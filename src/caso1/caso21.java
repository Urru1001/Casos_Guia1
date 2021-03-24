package caso1;
import java.util.Scanner;
public class caso21 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Valor de gasto: ");
		float gasto = sc.nextFloat();
		
		float valredu = gasto * 0.88f;
		
		System.out.println("Valor reducido: " + valredu);

	}

}
