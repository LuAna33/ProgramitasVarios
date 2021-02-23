import java.util.Scanner;

public class AppConversionPesoADolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de dolares para calcular la conversion a pesos");
        int dolares;
        dolares= scanner.nextInt();
        System.out.println("Usted ha ingresado " + dolares + " dolares");
        int pesos = dolares * 150;
        System.out.println("El valor de sus dolares en pesos es  " + pesos);


    }
}
