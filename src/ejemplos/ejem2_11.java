package ejemplos;

import java.util.Scanner;

public class ejem2_11 {
    public static void main(String[] args) {
        float A,L,N,CM,V,PAG;
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese altura ");
        A= sc.nextFloat();
        System.out.println("ingrese el largo ");
        L=sc.nextFloat();
        System.out.println("ingrese el ancho ");
        N= sc.nextFloat();
        System.out.println("ingrese el coste de metro cubico");
        CM= sc.nextFloat();
        V=(A*L*N);
        System.out.println("el volumen de la alberca es de: "+V);
        PAG=V*CM;
        System.out.println("el pago que aras por metro cubico es del:" +PAG);
    }
}
