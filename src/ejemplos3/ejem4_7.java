package ejemplos3;

import java.util.Scanner;

public class ejem4_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números: ");
        int n = scanner.nextInt();
        int contadorMenoresIgualCero = 0;
        int contadorMayoresCero = 0;
        do {
            System.out.print("Ingrese un número: ");
            int numero = (int) scanner.nextDouble();
            if (numero <= 0) {
                contadorMenoresIgualCero++;
            } else {
                contadorMayoresCero++;
            }
            n--;
        } while (n > 0);
        System.out.println("Cantidad de números menores o iguales a cero: " + contadorMenoresIgualCero);
        System.out.println("Cantidad de números mayores a cero: " + contadorMayoresCero);
    }
}
