import java.util.Scanner;

public class AppControlSaldo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int saldoInicial = 22500;


        int opcion = -1;
        while (opcion != 3) {
            System.out.println("El saldo inicial es de $ " + saldoInicial);
            System.out.println("Seleccione una opcion");
            System.out.println("Opcion 1 Ingresar dinero");
            System.out.println("Opcion 2 Retirar dinero");
            System.out.println("Opcion 3 Terminar el programa");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Ud ha seleccionado ingresar dinero");
                    System.out.println("Ingrese la cantidad a depositar");
                    int saldoIngresado;
                    saldoIngresado= scanner.nextInt();
                    System.out.println("Ud ha depositado $ " + saldoIngresado);
                    int saldoActualizadoI = saldoInicial + saldoIngresado;
                    System.out.println("Al momento ud cuenta con un saldo total de $ " + saldoActualizadoI);
                    saldoInicial=saldoActualizadoI;

                    break;
                case 2:
                    System.out.println("Ud ha seleccionado retirar dinero");
                    System.out.println("Ingrese la cantidad a retirar");
                    int saldoRetirado;
                    saldoRetirado = scanner.nextInt();
                    System.out.println("Ud ha retirado $ " + saldoRetirado);
                    int saldoactualizadoR = saldoInicial - saldoRetirado;
                    System.out.println("Al momento ud cuenta con un saldo total de $ " + saldoactualizadoR);
                    saldoInicial = saldoactualizadoR;
                    break;

                case 3:
                     System.out.println("Ud ha seleccionado terminar el programa");
                     break;
            }

        }
    }
}