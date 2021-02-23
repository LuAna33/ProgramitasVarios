import java.util.Scanner;

public class AppIVA {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa para calcular el IVA de un producto ");

        System.out.println("Ingresar precio del producto");
        int precio;
        precio = scanner.nextInt();

        System.out.println("Ingresar valor IVA");
        int iva;
        iva = scanner.nextInt();

        int totalIva = precio * iva / 100;
        System.out.println("El monto calculado de IVA es : $ " + totalIva );

        int precioIvaAplicado = precio + totalIva;
        System.out.println("El valor del producto con el IVA aplicado es : $ " + precioIvaAplicado);


    }
}
