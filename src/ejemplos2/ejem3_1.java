package ejemplos2;

import java.util.Scanner;

public class ejem3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dato1, dato2, mayor;
        System.out.print("Ingrese el primer valor: ");
        dato1 = scanner.nextInt();
        System.out.print("Ingrese el segundo valor: ");
        dato2 = scanner.nextInt();
        if (dato1 > dato2) {
            mayor = dato1;
        } else {
            mayor = dato2;
        }
        System.out.println("El valor mayor es: " + mayor);
    }
}
