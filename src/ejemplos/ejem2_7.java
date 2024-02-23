package ejemplos;

import java.util.Scanner;

public class ejem2_7 {
    public static void main(String[] args) {
        float l;
        float pg=7;
        float tg,ga;
        Scanner sc=new Scanner(System.in);
        System.out.println("digite en litros: ");
        l= sc.nextFloat();
        tg= (float) (l/3.785);
        System.out.println("de litros a galeones en total es: "+tg);
        System.out.println("la ganancia que sale de la leche es: "+(ga=(pg*tg)));
    }
}
