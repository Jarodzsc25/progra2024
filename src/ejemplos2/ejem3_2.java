package ejemplos2;

import java.util.Scanner;

public class ejem3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.print("Ingrese un número: ");
        numero = scanner.nextInt();
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else {
            System.out.println("El número es negativo.");
        }
    }
}
