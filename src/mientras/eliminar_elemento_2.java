package mientras;

import java.util.LinkedList;
import java.util.Queue;

public class eliminar_elemento_2 {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();

        cola.add("rojo");
        cola.add("verde");
        cola.add("azul");
        cola.add("amarillo");
        System.out.println("Con todo: " + cola);
        cola.remove("rojo");
        cola.remove("amarillo");
        System.out.println("Sin 2 elementos: " + cola);
    }
}
