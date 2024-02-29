package ejemplos2;

import java.util.Scanner;

public class ejem3_9 {
    public static void main(String[] args) {
        int duracionLlamada;
        String diaSemana;
        String turnoLlamada;
        double costoMinuto;
        double impuesto;
        double costoTotal;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la duración de la llamada en minutos: ");
        duracionLlamada = scanner.nextInt();
        System.out.print("Ingrese el día de la semana (L-V, D): ");
        diaSemana = scanner.next();
        System.out.print("Ingrese el turno de la llamada (M, V): ");
        turnoLlamada = scanner.next();
        if (duracionLlamada <= 5) {
            costoMinuto = 1.0;
        } else if (duracionLlamada <= 8) {
            costoMinuto = 0.8;
        } else if (duracionLlamada <= 10) {
            costoMinuto = 0.7;
        } else {
            costoMinuto = 0.5;
        }
        if (diaSemana.equalsIgnoreCase("D")) {
            impuesto = 0.03;
        } else if (turnoLlamada.equalsIgnoreCase("M")) {
            impuesto = 0.15;
        } else {
            impuesto = 0.10;
        }
        costoTotal = duracionLlamada * costoMinuto * (1 + impuesto);
        System.out.println("Costo por minuto: $" + costoMinuto);
        System.out.println("Impuesto: $" + impuesto);
        System.out.println("Costo total: $" + costoTotal);
    }
}
