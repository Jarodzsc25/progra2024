package ejemplos;

import java.util.Scanner;

public class multiplar {
    public static void main(String[] args) {
        int A;
        int B;
        int area;
        Scanner sc=new Scanner(System.in);
        System.out.println("dijite el primer dato");
        A=sc.nextInt();
        System.out.println("dijite el segundo dato");
        B=sc.nextInt();
        System.out.println("el area es: "+ (area =A*B));
    }
}
