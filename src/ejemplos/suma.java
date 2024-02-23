package ejemplos;

import java.util.Scanner;

public class suma {
    public static void main(String[] args) {
      int A;
      int B;
      int C;
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese el primer dato entero:");
        A = sc.nextInt();
        System.out.println("ingrese el segundo dato entero:");
        B = sc.nextInt();
        C=A+B;
        System.out.println("la suma es: "+C);
    }
}
