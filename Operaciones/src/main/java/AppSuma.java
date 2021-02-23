import java.util.Scanner;

public class AppSuma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa que permite sumar tres valores");
        System.out.println("Ingresar el primer numero");
        int num1 = scanner.nextInt();
        System.out.println("El numero ingresado es: " + num1);
        System.out.println("Ingresar un segundo numero");
        int num2 = scanner.nextInt();
        System.out.println("El numero ingresado es: " + num2);
        int resultado1 = num1 + num2;
        System.out.println("Resultado de la suma de los dos numeros ingresados: " + resultado1);
        System.out.println("Ingresar un tercer numero");
        int num3 = scanner.nextInt();
        System.out.println("El numero ingresado es: " + num3);

        int resultado2 = resultado1 + num3;

        System.out.println("El resultado de la suma entre los tres numeros ingresados es: "+ resultado2);
        System.out.println("El programa finalizó");

    }
}
