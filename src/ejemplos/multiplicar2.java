package ejemplos;

import java.util.Scanner;

public class multiplicar2 {
    public static void main(String[] args) {
        float R,Area;
        float pi=3.1416F;
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese el radio");
        R=sc.nextFloat();
        System.out.println("el area es: "+(Area=(R*R)*pi));
    }
}
