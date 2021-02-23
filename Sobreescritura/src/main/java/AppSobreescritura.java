import java.util.Scanner;

public class AppSobreescritura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = 5;
        int num2 = 7;

        System.out.println("El primer número es: " + num1);
        System.out.println("El segundo número es: " + num2);

        System.out.println("Para modificar el primer número ingrese otro valor ");
        num1 = scanner.nextInt();
        System.out.println("Para modificar el segundo número ingrese otro valor ");
        num2 = scanner.nextInt();

        System.out.println("El nuevo valor del primer número es : " + num1);
        System.out.println("El nuevo valor del primer número es : " + num2);

        System.out.println("Fin del Programa");


    }
}
