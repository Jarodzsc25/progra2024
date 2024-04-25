package mientras;
import java.util.Queue;
import java.util.LinkedList;
public class vaciar_cola {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();

        cola.add("A");
        cola.add("B");
        cola.add("C");
        cola.add("D");
        cola.add("E");

        cola.clear();

        cola.add("F");
        cola.add("G");
        cola.add("H");
        cola.add("I");
        cola.add("J");
        for (String elemento : cola) {
            System.out.println(elemento);
        }
    }
}
