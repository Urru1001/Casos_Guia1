package caso1;
import java.util.Scanner;
public class caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Primer numero: ");
		float n1 = sc.nextFloat();
		
		System.out.print("Segundo numero: ");
		float n2 = sc.nextFloat();
		
		float prom = (n1 + n2) / 2;
		float aum = (float) (n1 * 12 ) / 10;
		float dis = (float) (n2 * 7) / 10 ;
		
		System.out.println(" \n---- RESULTADOS  ---- ");
		System.out.println("Suma ..............: " + prom);
		System.out.println("Aumentar el 20% ...: " + aum);
		System.out.println("Disminuir el 30% ..: " + dis);

	}

}
