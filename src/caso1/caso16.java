package caso1;
import java.util.Scanner;

import java.text.DecimalFormat;
public class caso16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese horas trabajadas: ");
		float horas = sc.nextFloat();
		
		System.out.print("Ingrese tarifa por hora: ");
		float tarifa = sc.nextFloat();
		
		float sueldo = horas * tarifa;
		float bono = sueldo * 0.05f;
		float total = sueldo + bono;
		float Tdolar = total / 3.24f;
		
		System.out.println("Sueldo......................: " + df.format(sueldo));
		System.out.println("Bono........................: " + df.format(bono));
		System.out.println("Total.......................: " + df.format(total));
		System.out.println("Total en Dolares............: " + df.format(Tdolar));

	}

}
