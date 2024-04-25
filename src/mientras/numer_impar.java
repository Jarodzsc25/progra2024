package mientras;
import java.util.LinkedList;
import java.util.Queue;
public class numer_impar {
    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<>();
        for (int i = 1; i <= 10; i++) {
            cola.offer(2 * i - 1);/*cola.offer(2 * i - 1) se utiliza para agregar números impares a la cola*/
        }
        System.out.println("son:");
        while (!cola.isEmpty()) {
            System.out.println(cola.poll());
        }
    }
}
