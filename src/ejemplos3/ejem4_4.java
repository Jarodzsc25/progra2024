package ejemplos3;

import java.util.Scanner;

public class ejem4_4 {
    public static void main(String[] args) {
        int contador=1;
        int suma=0;
        int edad,numalum,edadpromedio;
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese la cantidad de alumnos: ");
        numalum= sc.nextInt();
        while(contador<=numalum){
            System.out.println("ingrese la edad: ");
            edad = sc.nextInt();
            suma=suma+edad;
            contador=contador+1;
        }
        edadpromedio=suma/numalum;
        System.out.println("la edad promedio es de: "+edadpromedio);
    }
}
