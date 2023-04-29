import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la factura: ");
        String nombre = sc.nextLine();

        System.out.println("Ingrese el precio del producto uno: ");
        double productoUno = sc.nextDouble();

        System.out.println("Ingrese el precio del producto dos: ");
        double productoDos = sc.nextDouble();

        double subtotal = productoUno + productoDos;
        double total = subtotal + (subtotal*0.19);

        System.out.println("nombre de factura = " + nombre);
        System.out.println("total = " + total);
    }
}
