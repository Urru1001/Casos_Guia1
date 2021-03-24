package caso1;
import java.util.Scanner;
public class caso10 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese valor del radio: ");
		float radio = sc.nextInt();
		
		double pi = 3.1416;
		
		float area = (float) pi * radio * radio;
		double perimetro = (float) 2 * pi * radio;
		
		System.out.println("--------RESULTADOS------");
		System.out.println("Área del circulo.......: " + area);
		System.out.println("Perímetro del circulo.......: " + perimetro);

	}

}
