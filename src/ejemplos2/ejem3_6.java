package ejemplos2;

import java.util.Scanner;

public class ejem3_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidadPersonas;
        double costoPlatillo, presupuestoTotal;
        System.out.print("Ingrese la cantidad de personas que asistirán al evento: ");
        cantidadPersonas = scanner.nextInt();
        if (cantidadPersonas <= 200) {
            costoPlatillo = 95.00;
        } else if (cantidadPersonas <= 300) {
            costoPlatillo = 85.00;
        } else {
            costoPlatillo = 75.00;
        }
        presupuestoTotal = cantidadPersonas * costoPlatillo;
        System.out.println("El presupuesto total del banquete es: $" + presupuestoTotal);
    }
    }

