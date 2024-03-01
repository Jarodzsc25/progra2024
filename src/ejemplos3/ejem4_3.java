package ejemplos3;

import java.util.Scanner;

public class ejem4_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int suma=0;
        for (int contador=1;contador<=10;contador++){
            System.out.println("ingrese un valor numerico: ");
            int valor = sc.nextInt();
            suma=suma+valor;
        }
        System.out.println("la suma es: "+suma);

    }
}
