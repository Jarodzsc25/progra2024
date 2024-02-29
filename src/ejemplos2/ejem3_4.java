package ejemplos2;

import java.util.Scanner;

public class ejem3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precioOriginal, descuento, precioFinal, montoDescuento;
        System.out.print("Ingrese el precio original del traje: ");
        precioOriginal = scanner.nextDouble();
        if (precioOriginal > 2500.00) {
            descuento = 0.15;
        } else {
            descuento = 0.08;
        }
        montoDescuento = precioOriginal * descuento;
        precioFinal = precioOriginal - montoDescuento;
        System.out.println("El precio final del traje es: $" + precioFinal);
        System.out.println("El descuento aplicado es: $" + montoDescuento);
    }
}
