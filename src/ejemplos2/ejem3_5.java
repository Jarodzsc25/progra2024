package ejemplos2;

import java.util.Scanner;

public class ejem3_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor1, valor2, valor3, mayor;
        System.out.print("Ingrese el primer valor: ");
        valor1 = scanner.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        valor2 = scanner.nextInt();
        System.out.print("Ingrese el tercer valor: ");
        valor3 = scanner.nextInt();
        if (valor1 > valor2) {
            if (valor1 > valor3) {
                mayor = valor1;
            } else {
                mayor = valor3;
            }
        } else {
            if (valor2 > valor3) {
                mayor = valor2;
            } else {
                mayor = valor3;
            }
        }
        System.out.println("El valor mayor es: " + mayor);
    }
}
