package mientras;
import java.util.LinkedList;
import java.util.Queue;
class Persona {
    private String nombres;
    private String apellidos;

    public Persona(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                '}';
    }
}
public class imprimir_cola {
        public static void main(String[] args) {
            Queue<Persona> colaPersonas = new LinkedList<>();
            colaPersonas.add(new Persona("Luis", "Mañes Rios"));
            colaPersonas.add(new Persona("Marta Maria", "González Perez"));
            colaPersonas.add(new Persona("Estuart", "Domingues"));
            for (Persona persona : colaPersonas) {
                System.out.println(persona);
            }
        }
    }
