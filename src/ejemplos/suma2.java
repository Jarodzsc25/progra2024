package ejemplos;

import java.util.Scanner;

public class suma2 {
    public static void main(String[] args) {
        int A;
        int B;
        int C;
        int D;
        int E;
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese el primer dato entero:");
        A = sc.nextInt();
        System.out.println("ingrese el segundo dato entero:");
        B = sc.nextInt();
        System.out.println("ingrese el tercer dato entero:");
        C = sc.nextInt();
        System.out.println("ingrese el cuarto dato entero:");
        D = sc.nextInt();
        E=A+B+C+D;
        System.out.println("la suma es: "+E);
    }
}
