package mientras;
import java.util.LinkedList;
import java.util.Queue;
public class dos_colas {
    public static void main(String[] args) {
        Queue<String> cola1 = new LinkedList<>();
        Queue<String> cola2 = new LinkedList<>();
        Queue<String> cola3 = new LinkedList<>();

        cola1.offer("A"); /*agregar elemento offer*/
        cola1.offer("B");
        cola1.offer("C");
        cola1.offer("D");
        cola1.offer("E");

        cola2.offer("1");
        cola2.offer("2");
        cola2.offer("3");
        cola2.offer("4");
        cola2.offer("5");
/*!cola1.isEmpty() se utiliza en Java para verificar si la cola cola1 no está vacía*/
        while (!cola1.isEmpty() && !cola2.isEmpty()) {
            cola3.offer(cola1.poll()); /*con el offer agregas el elemento a la cola 3*/
            cola3.offer(cola2.poll()); /*con el poll retiras un elemento*/
        }

        System.out.println("combinando cola 1 y 2:");
        while (!cola3.isEmpty()) {
            System.out.println(cola3.poll());
        }
    }
}
