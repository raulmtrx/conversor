import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean salir = false;

        while (!salir) {
            int opcion;
            float cantidad;
            Scanner scanner = new Scanner(System.in);
            Conversor conversor = new Conversor();

            System.out.println("*******************************************************************");
            System.out.println("Sea bienvenido/a al Conversor de Moneda =]");
            System.out.println("\n1) Dólar =>> Peso argentino");
            System.out.println("2) Peso argentino =>> Dólar");
            System.out.println("3) Dólar =>> Real brasileño");
            System.out.println("4) Real brasileño ==>> Dólar");
            System.out.println("5) Dólar =>> Peso colombiano");
            System.out.println("6) Peso colombiano =>> Dólar");
            System.out.println("7) Salir");
            System.out.println("Elija una opción válida:");
            System.out.println("*******************************************************************");

            opcion = scanner.nextInt();

            if (opcion == 7) {
                System.out.println("Cerrando aplicación...");
                salir = true;
            }
            else if (opcion < 7) {
                System.out.println("Ingrese el valor que deseas convertir:");

                cantidad = scanner.nextFloat();
                double valor = 0;
                String moneda1 = "[]";
                String moneda2 = "[]";

                switch (opcion) {
                    case 1:
                        valor = conversor.convertir("USD", "ARS") * cantidad;
                        moneda1 = "[USD]";
                        moneda2 = "[ARS]";
                        break;
                    case 2:
                        valor = conversor.convertir("ARS", "USD") * cantidad;
                        moneda1 = "[ARS]";
                        moneda2 = "[USD]";
                        break;
                    case 3:
                        valor = conversor.convertir("USD", "BRL") * cantidad;
                        moneda1 = "[USD]";
                        moneda2 = "[BRL]";
                        break;
                    case 4:
                        valor = conversor.convertir("BRL", "USD") * cantidad;
                        moneda1 = "[BRL]";
                        moneda2 = "[USD]";
                        break;
                    case 5:
                        valor = conversor.convertir("USD", "COP") * cantidad;
                        moneda1 = "[USD]";
                        moneda2 = "[COP]";
                        break;
                    case 6:
                        valor = conversor.convertir("COP", "USD") * cantidad;
                        moneda1 = "[COP]";
                        moneda2 = "[USD]";
                        break;
                }

                System.out.println("El valor " + cantidad + " " + moneda1 + " corresponde al valor final de =>>> " + valor + " " + moneda2);
            }else {
                System.out.println("Por favor, introduzca una opción válida.");
            }
        }
    }
}
