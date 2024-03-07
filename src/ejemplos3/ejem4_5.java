package ejemplos3;

import java.util.Scanner;

public class ejem4_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, i, suma;
        double promedio;
        n = 0;
        i = 0;
        suma = 0;
        System.out.print("Ingrese el número de alumnos: ");
        n = scanner.nextInt();
        do {
            System.out.print("Ingrese la edad del alumno " + (i + 1) + ": ");
            int edad = scanner.nextInt();

            suma += edad;
            i++;
        } while (i < n);
        promedio = suma / n;
        System.out.println("El promedio de edad del grupo es: " + promedio);
    }
}
