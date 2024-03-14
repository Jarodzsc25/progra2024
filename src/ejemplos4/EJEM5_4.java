package ejemplos4;

import java.util.Scanner;

public class EJEM5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de alumnos: ");
        int n = sc.nextInt();
        String[] nombres = new String[n];
        double[] promedios = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el nombre del alumno " + (i + 1) + ": ");
            nombres[i] = sc.next();
            System.out.print("Ingrese el promedio del alumno " + (i + 1) + ": ");
            promedios[i] = sc.nextDouble();
        }
        ordenar(promedios, nombres);
        System.out.println("Nombres y promedios ordenados de mayor a menor:");
        for (int i = 0; i < n; i++) {
            System.out.println(nombres[i] + " - " + promedios[i]);
        }
    }

    private static void ordenar(double[] promedios, String[] nombres) {
        for (int i = 0; i < promedios.length - 1; i++) {
            for (int j = i + 1; j < promedios.length; j++) {
                if (promedios[i] < promedios[j]) {
                    double temp = promedios[i];
                    promedios[i] = promedios[j];
                    promedios[j] = temp;
                    String tempNombre = nombres[i];
                    nombres[i] = nombres[j];
                    nombres[j] = tempNombre;
                }
            }
        }
    }
}
