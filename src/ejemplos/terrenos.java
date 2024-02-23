package ejemplos;

import java.util.Scanner;

public class terrenos {
    public static void main(String[] args) {
        float a,b,c;
        float at,ar, area;
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese la base(b): ");
        b= sc.nextFloat();
        System.out.println("ingrese la altura(a): ");
        a= sc.nextFloat();
        System.out.println("ingrese la altura(c): ");
        c=sc.nextFloat();
        System.out.println("el area del triangulo es: "+(at=(b*(a-c))/2));
        System.out.println("el area del rectangulo es: "+(ar=b*c));
        System.out.println("el area total es: "+(area=at+ar));
    }
}
