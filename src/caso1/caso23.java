package caso1;
import java.util.Scanner;
public class caso23 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Nombre del producto: ");
		String producto = sc.nextLine();
		
		System.out.print("Precio: ");
		float precio = sc.nextInt();
		
		System.out.print("Cantidad: ");
		int cantidad = sc.nextInt();
		
		float importe = precio * cantidad;
		
		float igv = importe * 0.18f;
		
		float descuento = importe * 0.03f;
		
		float total = importe + igv - descuento;
		
		System.out.println("Producto.......: " + producto);
		System.out.println("Importe........: " + importe);
		System.out.println("IGV............: " + igv);
		System.out.println("Descuento......: " + descuento);
		System.out.println("Total..........: " + total);

	}

}
