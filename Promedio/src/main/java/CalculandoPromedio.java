import java.util.Scanner;

public class CalculandoPromedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa para calcular el promedio entre cuatro valores");
        System.out.println("Ingresar el primer valor");
        int num1= scanner.nextInt();
        System.out.println("Ingresar el segundo valor");
        int num2= scanner.nextInt();
        System.out.println("Ingresar el tercer valor");
        int num3= scanner.nextInt();
        System.out.println("Ingresar el cuarto valor");
        int num4= scanner.nextInt();

        int sumaValores= num1 + num2 + num3 + num4;
        int promedio= sumaValores/4;
        System.out.println("El promedio entre los cuatro valores ingresados es " + promedio);
    }
}
