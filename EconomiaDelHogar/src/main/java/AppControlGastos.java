import java.util.Scanner;

public class AppControlGastos {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int salario;
        int alquiler;
        int servicios;
        int transporte;
        int supermercado;
        int gimnasio;
        int esparcimiento;
        int reservaimprevistos;

        System.out.println("Ingresar salario percibido ");
        salario= scanner.nextInt();
        System.out.println("El monto ingresado es de $ " + salario);

        System.out.println("Gastos Mensuales");

        System.out.println("Ingresar valor alquiler");
        alquiler= scanner.nextInt();

        System.out.println("Ingresar valor total de Servicios");
        servicios= scanner.nextInt();

        System.out.println("Ingresar valor total de transporte");
        transporte= scanner.nextInt();

        System.out.println("Ingresar valor total de Supermercado");
        supermercado= scanner.nextInt();

        System.out.println("Ingresar valor total de Gimnasio");
        gimnasio= scanner.nextInt();

        System.out.println("Ingresar valor total de Esparcimiento");
        esparcimiento= scanner.nextInt();

        System.out.println("Ingresar valor total de Reserva de Imprevistos");
        reservaimprevistos= scanner.nextInt();

        int sumaGastos= alquiler + servicios+ transporte + supermercado + gimnasio +esparcimiento + reservaimprevistos;
        System.out.println( "Los gastos mensuales suman $ " + sumaGastos);

        int gastosDescontados = salario - sumaGastos;
        System.out.println("Quedan disponibles $ " + gastosDescontados + " de su salario");


        }

    }

