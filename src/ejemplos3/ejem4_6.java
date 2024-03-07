package ejemplos3;

import java.util.Scanner;

public class ejem4_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ahorroTotal = 0;
        int ahorroMensual;
        int mes = 1;

        while (mes <= 12) {
            System.out.print("Ingrese el depósito del mes " + mes + ": ");
            int deposito = scanner.nextInt();

            ahorroTotal += deposito;
            ahorroMensual = deposito;

            System.out.println("Ahorro en el mes " + mes + ": " + ahorroMensual);
            mes++;
        }
        System.out.println("Ahorro total al final del año: " + ahorroTotal);
    }
}
