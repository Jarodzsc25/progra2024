package ejemplos;

import java.util.Scanner;

public class ejem2_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float y1,x1,y2,x2;
        float X,Y,D;
        System.out.println("ingrese los datos");
        y1= sc.nextFloat();
        y2= sc.nextFloat();
        x1= sc.nextFloat();
        x2= sc.nextFloat();
        System.out.println("la X vale: "+(X=x2-x1));
        System.out.println("la Y vale: "+(Y=y2-y1));
        System.out.println("la distacia es de: ");
    }
}
