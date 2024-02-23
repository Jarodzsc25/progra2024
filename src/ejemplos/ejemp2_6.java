package ejemplos;

import java.util.Scanner;

public class ejemp2_6 {
    public static void main(String[] args) {
      float c,r,h;
      float at,ac,area;
      float pi=3.1416F;
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese el radio:");
        r= sc.nextFloat();
        System.out.println("ingrese la diagonal: ");
        h= sc.nextFloat();
        c=(float) Math.sqrt(Math.pow(h,2)-Math.pow(r,2));
        at=2*(r*c)/2;
        ac=(float) (pi*Math.pow(r,2)/2);
        area=at+ac;
        System.out.println("area total de la gota es: "+area);
    }
}
