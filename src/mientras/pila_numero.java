package mientras.progra2024.src.mientras;
import java.util.Stack;
public class pila_numero {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();

        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(5);

        int numBus = 4;

        boolean encontrado = false;
        for (Integer numero : pila) {
            if (numero == numBus) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El número " + numBus + " está en la pila.");
        } else {
            System.out.println("El número " + numBus + " no está en la pila.");
        }
    }
}
