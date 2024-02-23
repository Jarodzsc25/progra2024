package ejemplos;

import java.util.Scanner;

public class ejem2_9 {
    public static void main(String[] args) {
        float ht,ph,ss;
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese las horas trabajas: ");
        ht= sc.nextFloat();
        System.out.println("ingrese cuanto le pagan por hora: ");
        ph=sc.nextFloat();
        System.out.println("su sueldo semanal es: "+(ss=ht*ph));
    }
}
