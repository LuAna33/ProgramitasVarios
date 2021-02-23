import java.util.Scanner;

public class AppControlStock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stockInicial = 30;
        int productosVendidos;
        System.out.println("El Almacén cuenta con un stock inicial de: "+ stockInicial + " artículos");

        System.out.println("Ingresar cantidad de productos vendidos");
        productosVendidos= scanner.nextInt();

        int stockActualizado = stockInicial - productosVendidos;
        System.out.println("El Stock actual cuenta con : " + stockActualizado + " artículos");

    }
}
