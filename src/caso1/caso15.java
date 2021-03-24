package caso1;
import java.util.Scanner;
import java.text.DecimalFormat;
public class caso15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese Cantidad: ");
		int cantidad = sc.nextInt();
		
		System.out.print("Ingrese precio: ");
		float precio = sc.nextFloat();
		
		float importe1 = cantidad * precio;
		float importe2 = (float) (importe1 / 3.24);
		
		System.out.println("\n------RESULTADOS--------");
		System.out.println("Importe en soles..: " + df.format(importe1));
		System.out.println("Importe en dólares..: " + df.format(importe2));

	}

}
