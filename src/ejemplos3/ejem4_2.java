package ejemplos3;

import java.util.Scanner;

public class ejem4_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int suma=0;
        int contador = 1;
        do {
            System.out.println("ingrese un valor numerico: ");
            int valor = sc.nextInt();
            suma=suma+valor;
            contador=contador+1;

        }while (contador<=10);
        System.out.println("la suma es: "+suma);
    }
}
