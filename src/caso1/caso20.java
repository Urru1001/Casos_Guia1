package caso1;
import java.util.Scanner;
public class caso20 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Valor de venta: " + "S/. ");
		float venta = sc.nextFloat();
		
		float aument = venta * 1.42f;
		
		System.out.println("Valor incrementado a : " + "S/. " + aument);

	}

}
