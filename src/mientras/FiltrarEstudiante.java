package mientras.progra2024.src.mientras;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class FiltrarEstudiante {
    private String nombre;
    private double puntaje;

    public FiltrarEstudiante(String nombre, double puntaje) {
        this.nombre = nombre;
        this.puntaje = puntaje;
    }

    public double getPuntaje() {
        return puntaje;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre = '" + nombre + '\'' +
                ", puntaje = " + puntaje +
                '}';
    }
}
class LO {
    public static void main(String[] args) {
        List<FiltrarEstudiante> estudiantes = new ArrayList<>();
        estudiantes.add(new FiltrarEstudiante("Luisa ", 4.5));
        estudiantes.add(new FiltrarEstudiante("Rosario", 7.2));
        estudiantes.add(new FiltrarEstudiante("Lucho", 2.8));
        estudiantes.add(new FiltrarEstudiante("Kevin", 8.3));

        List<FiltrarEstudiante> buenosEstudiantes = estudiantes.stream()
                .filter(estudiante -> estudiante.getPuntaje() > 5.0)
                .collect(Collectors.toList());

        System.out.println("Estudiantes con más de 5.0 puntos: ");
        for (FiltrarEstudiante estudiante : buenosEstudiantes) {
            System.out.println(estudiante);
        }
    }
}