package mientras;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class menu_con_cola {
    public static void main(String[] args) {
        Queue<String> cola = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        int dato;
        do {
            System.out.println("Menú:");
            System.out.println("1. Agregar a la cola");
            System.out.println("2. Retirar de la cola");
            System.out.println("3. Mostrar la cola");
            System.out.println("4. Salir");
            System.out.print("¿que desea hacer?: ");
            dato = scanner.nextInt();

            switch (dato) {
                case 1:
                    System.out.print("Ingrese el nombre a agregar: ");
                    String nombre = scanner.next();
                    cola.offer(nombre);
                    break;
                case 2:
                    if (!cola.isEmpty()) {
                        String persona = cola.poll();
                        System.out.println("Persona retirada de la cola: " + persona);
                    } else {
                        System.out.println("Cola está vacía.");
                    }
                    break;
                case 3:
                    if (!cola.isEmpty()) {
                        System.out.println("Personas en la cola:");
                        for (String persona : cola) {
                            System.out.println(persona);
                        }
                    } else {
                        System.out.println("Cola está vacía.");
                    }
                    break;
                case 4:
                    System.out.println("Usted acabo.....");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese un número válido.");
            }
        } while (dato != 4);

        scanner.close();
    }
}
