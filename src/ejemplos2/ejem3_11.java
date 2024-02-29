package ejemplos2;

import java.util.Scanner;

public class ejem3_11 {
    public static void main(String[] args) {
        String tipoHamburguesa;
        int numeroHamburguesas;
        boolean pagaConTarjeta;
        double costoHamburguesa;
        double costoTotalSinTarjeta;
        double costoTotalConTarjeta;
        double cargoTarjeta;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tipo de hamburguesa (S, D, T): ");
        tipoHamburguesa = scanner.next();

        System.out.print("Ingrese el número de hamburguesas: ");
        numeroHamburguesas = scanner.nextInt();

        System.out.print("¿Paga con tarjeta? (S/N): ");
        pagaConTarjeta = scanner.next().equalsIgnoreCase("S");
        switch (tipoHamburguesa) {
            case "S":
                costoHamburguesa = 20.0;
                break;
            case "D":
                costoHamburguesa = 25.0;
                break;
            case "T":
                costoHamburguesa = 28.0;
                break;
            default:
                System.out.println("Tipo de hamburguesa no válido");
                return;
        }
        costoTotalSinTarjeta = costoHamburguesa * numeroHamburguesas;
        if (pagaConTarjeta) {
            cargoTarjeta = costoTotalSinTarjeta * 0.05;
        } else {
            cargoTarjeta = 0.0;
        }
        costoTotalConTarjeta = costoTotalSinTarjeta + cargoTarjeta;
        System.out.println("Costo total sin tarjeta: $" + costoTotalSinTarjeta);
        System.out.println("Cargo por tarjeta: $" + cargoTarjeta);
        System.out.println("Costo total con tarjeta: $" + costoTotalConTarjeta);

    }
}
