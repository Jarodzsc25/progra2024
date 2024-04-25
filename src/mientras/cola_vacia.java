package mientras;
import java.util.LinkedList;
import java.util.Queue;
public class cola_vacia {
    public static void main(String[] args) {

        Queue<Integer> cola = new LinkedList<>();

        for (int i = 0; i <= 20; i += 2) {
            cola.add(i);
        }

        // Imprimir los elementos de la cola
        System.out.println("Elementos de la cola:");
        while (!cola.isEmpty()) {
            System.out.println(cola.poll());
        }
    }
}
