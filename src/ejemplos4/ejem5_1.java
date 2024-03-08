package ejemplos4;

import java.util.Scanner;

public class ejem5_1 {
    public static void main(String[] args) {
        int alumnos;
        Scanner obj = new Scanner(System.in);
        System.out.print("cantidad de alumnos: ");
        alumnos = obj.nextInt();
        int[] array = new int[20];
        System.out.println("ingrese las edades: ");
        for (int i = 0; i < alumnos; i++) {
            array[i] = obj.nextInt();
        }
        System.out.println("las edades que ingreso son: ");
        for (int i = 0; i < alumnos; i++) {
            System.out.println(array[i]);
        }
    }
}
