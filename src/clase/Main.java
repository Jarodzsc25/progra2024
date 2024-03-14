package clase;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    private static ArrayList<Alumno> alumnos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    registrarAlumno();
                    break;
                case 2:
                    //eliminarAlumno();
                    break;
                case 3:
                    //modificarAlumno();
                    break;
                case 4:
                    //listarAlumnos();
                    break;
                case 5:
                    //buscarAlumno();
                    break;
                case 6:
                    System.out.println("¡Saliendo del programa!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 6);
    }

    private static void mostrarMenu() {
        System.out.println("\n**MENU DE ALUMNOS**");
        System.out.println("1. Registrar alumno");
        System.out.println("2. Eliminar alumno");
        System.out.println("3. Modificar alumno");
        System.out.println("4. Listar alumnos");
        System.out.println("5. Buscar alumno");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opción: ");
    }

    private static void registrarAlumno() {
        System.out.print("Ingrese el nombre del alumno: ");
        String nombre = scanner.next();
        System.out.print("Ingrese el nombre del alumno: ");
        String apellido1 = scanner.next();
        System.out.print("Ingrese el nombre del alumno: ");
        String apellido2 = scanner.next();
        System.out.print("Ingrese el carnet del alumno: ");
        int carnet = scanner.nextInt();
        System.out.print("Ingrese la carrera del alumno: ");
        String telefono = scanner.next();

        alumnos.add(new Alumno(nombre, apellido1, apellido2, carnet, telefono));
        System.out.println("¡Alumno registrado exitosamente!");
    }


}