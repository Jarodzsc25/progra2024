package ejemplos2;

import java.util.Scanner;

public class ejem3_10 {
    public static void main(String[] args) {
        String tipoAutobus;
        int kilometrosRecorridos;
        int numeroPersonas;
        double costoKilometro;
        double costoTotal;
        double costoPersona;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tipo de autobús (A, B, C): ");
        tipoAutobus = scanner.next();

        System.out.print("Ingrese los kilómetros recorridos: ");
        kilometrosRecorridos = scanner.nextInt();

        System.out.print("Ingrese el número de personas: ");
        numeroPersonas = scanner.nextInt();
        switch (tipoAutobus) {
            case "A":
                costoKilometro = 2.0;
                break;
            case "B":
                costoKilometro = 2.5;
                break;
            case "C":
                costoKilometro = 3.0;
                break;
            default:
                System.out.println("Tipo de autobús no válido");
                return;
        }
        if (numeroPersonas >= 20) {
            costoTotal = kilometrosRecorridos * costoKilometro * numeroPersonas;
        } else {
            costoTotal = kilometrosRecorridos * costoKilometro * 20;
        }
        costoPersona = costoTotal / numeroPersonas;
        System.out.println("Costo por kilómetro: $" + costoKilometro);
        System.out.println("Costo total: $" + costoTotal);
        System.out.println("Costo por persona: $" + costoPersona);
    }
}
