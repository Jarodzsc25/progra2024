package mientras;
import java.util.LinkedList;
import java.util.Queue;
public class sumar_impares {
    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<>();

        cola.offer(1);
        cola.offer(2);
        cola.offer(3);
        cola.offer(4);
        cola.offer(5);
        cola.offer(6);
        cola.offer(7);
        cola.offer(8);
        cola.offer(9);
        cola.offer(10);

        int sumimpa= 0;
        for (Integer todo : cola) {
            if (todo % 2 != 0) {
                sumimpa += todo;
            }
        }
        System.out.println("La suma de los elementos impares en la cola es: " + sumimpa);
    }
}
