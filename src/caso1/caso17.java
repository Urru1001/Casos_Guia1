package caso1;
import java.util.Scanner;
import java.text.DecimalFormat;
public class caso17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Numero de Aprobados: ");
		int na = sc.nextInt();
		
		System.out.print("Numero de Desaprobados: ");
		int nd = sc.nextInt();
		
		System.out.print("Numero de Retirados: ");
		int nr = sc.nextInt();
		
		float total = na + nd + nr;
		
		float pa = na / total * 100;
		float pd = nd / total * 100;
		float pr = nr / total * 100;
		
		System.out.println("\n------RESULTADOS------");
		System.out.println("Aprobados ......: " + df.format(pa) + "%");
		System.out.println("Desaprobados ...: " + df.format(pd) + "%");
		System.out.println("Desaprobados ...: " + df.format(pr) + "%");

	}

}
