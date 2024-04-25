package mientras;
import java.util.LinkedList;
import java.util.Queue;
public class cola_antes_de_eliminar_elemento {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();

        cola.add("perro");
        cola.add("gato");
        cola.add("conejo");
        cola.add("loro");
        System.out.println("Con conejo: " + cola);
        cola.remove("conejo");
        System.out.println("Sin conejo: " + cola);
    }
}
