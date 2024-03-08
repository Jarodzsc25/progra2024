package ejemplos4;

import java.util.Scanner;

public class ejem5_2 {
    public static void main(String[] args) {
        int cantidad,suma = 0;
        Scanner obj = new Scanner(System.in);
        System.out.print("ingrese la cantidad de elementos que desea sumar: ");
        cantidad = obj.nextInt();
        int[] array = new int[20];
        System.out.println("ingrese las sumatorias: ");
        for (int i = 0; i < cantidad; i++) {
            array[i] = obj.nextInt();
        }
        for (int i = 0; i < cantidad; i++) {
            suma = suma +array[i];
        }
        int total=suma;
        System.out.println("la suma del array es de: "+total);
    }
}
