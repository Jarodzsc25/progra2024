package mientras;
import java.util.LinkedList;
import java.util.Queue;
public class retirar_pares {
    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<>();

        for (int i = 1; i <= 10; i++) {
            cola.add(i);
        }
        System.out.println("completo: "+cola);
        System.out.println("sin pares: ");
        while (!cola.isEmpty()) {
            int par = cola.poll();
            if (par % 2 != 0) { /*solo vota impar*/
                System.out.println(par);
            }
        }
    }
}
