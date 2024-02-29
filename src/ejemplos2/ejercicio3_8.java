package ejemplos2;

import java.util.Scanner;

public class ejercicio3_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroAlumnos;
        double costoTotal, costoAlumno, pagoCompania;
        System.out.print("Ingrese la cantidad de alumnos que participarán en el viaje: ");
        numeroAlumnos = scanner.nextInt();
        if (numeroAlumnos >= 100) {
            costoTotal = numeroAlumnos * 65.00;
        } else if (numeroAlumnos >= 50) {
            costoTotal = numeroAlumnos * 70.00;
        } else if (numeroAlumnos >= 30) {
            costoTotal = numeroAlumnos * 95.00;
        } else {
            costoTotal = 4000.00;
        }
        costoAlumno = costoTotal / numeroAlumnos;
        if (numeroAlumnos < 30) {
            pagoCompania = 4000.00;
        } else {
            pagoCompania = costoTotal;
        }
        System.out.println("El costo total del viaje es: $" + costoTotal);
        System.out.println("El costo por alumno es: $" + costoAlumno);
        System.out.println("El pago a la compañía de autobuses es: $" + pagoCompania);
    }
}
