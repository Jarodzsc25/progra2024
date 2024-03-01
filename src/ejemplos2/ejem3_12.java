package ejemplos2;

import java.util.Scanner;

public class ejem3_12 {
    public static void main(String[] args) {
        int numeroCita;
        int costoCita;
        int montoTotalPagado;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de cita: ");
        numeroCita = scanner.nextInt();
        if (numeroCita <= 3) {
            costoCita = 200;
        } else if (numeroCita <= 5) {
            costoCita = 150;
        } else if (numeroCita <= 8) {
            costoCita = 100;
        } else {
            costoCita = 50;
        }
        if (numeroCita <= 3) {
            montoTotalPagado = numeroCita * costoCita;
        } else if (numeroCita <= 5) {
            montoTotalPagado = 3 * 200 + (numeroCita - 3) * 150;
        } else if (numeroCita <= 8) {
            montoTotalPagado = 3 * 200 + 2 * 150 + (numeroCita - 8) * 100;
        } else {
            montoTotalPagado = 3 * 200 + 2 * 150 + 3 * 100 + (numeroCita - 11) * 50;
        }
        System.out.println("Costo de la cita: $" + costoCita);
        System.out.println("Monto total pagado por el tratamiento: $" + montoTotalPagado);

    }
}
