package ejemplos2;

import java.util.Scanner;

public class ejem3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidad;
        double precioUnitario, costoTotal;
        System.out.print("Ingrese la cantidad de lápices: ");
        cantidad = scanner.nextInt();
        if (cantidad >= 1000) {
            precioUnitario = 0.85;
        } else {
            precioUnitario = 0.90;
        }
        costoTotal = cantidad * precioUnitario;
        System.out.println("El costo total es: $" + costoTotal);
    }
}
