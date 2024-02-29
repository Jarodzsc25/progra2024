package ejemplos2;

import java.util.Scanner;

public class ejem3_7 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String tipoUva;
        int tamanioUva;
        double precioInicial, kilosUva, precioFinal = 0, ganancia;
        System.out.print("Ingrese el tipo de uva (A o B): ");
        tipoUva = scanner.nextLine();
        System.out.print("Ingrese el tamaño de la uva (1 o 2): ");
        tamanioUva = scanner.nextInt();
        System.out.print("Ingrese el precio inicial del kilo de uva: ");
        precioInicial = scanner.nextDouble();
        System.out.print("Ingrese la cantidad de kilos de uva que se entregan en el embarque: ");
        kilosUva = scanner.nextDouble();

        if (tipoUva.equalsIgnoreCase("A")) {
            if (tamanioUva == 1) {
                precioFinal = precioInicial + 0.20;
            } else if (tamanioUva == 2) {
                precioFinal = precioInicial + 0.30;
            }
        } else if (tipoUva.equalsIgnoreCase("B")) {
            if (tamanioUva == 1) {
                precioFinal = precioInicial - 0.30;
            } else if (tamanioUva == 2) {
                precioFinal = precioInicial - 0.50;
            }
        }
        ganancia = precioFinal * kilosUva;

        System.out.println("La ganancia obtenida por el productor es: $" + ganancia);
    }
}
