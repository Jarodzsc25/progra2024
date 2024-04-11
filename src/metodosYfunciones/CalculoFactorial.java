package metodosYfunciones;

import java.util.Scanner;

public class CalculoFactorial {
    public static int calcularFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("solo numeros positivos");
        }
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int numero = scanner.nextInt();

        int factorial = calcularFactorial(numero);
        System.out.println("El factorial de " + numero + " es: " + factorial);

        scanner.close();
    }
}
