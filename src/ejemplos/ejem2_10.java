package ejemplos;

import java.util.Scanner;

public class ejem2_10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float cm,pg;
        System.out.println("cantidad en metros: ");
        cm= sc.nextFloat();
        pg = (float) (cm/0.0254);
        System.out.println("la cantidad en pulgadas es: "+pg);

    }
}
