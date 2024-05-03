package mientras.progra2024.src.mientras;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
public class Fruta {
    private String nombre;
    private int caloriasPorPorcion;

    public Fruta(String nombre, int caloriasPorPorcion) {
        this.nombre = nombre;
        this.caloriasPorPorcion = caloriasPorPorcion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCaloriasPorPorcion() {
        return caloriasPorPorcion;
    }
}
class Lola {
    public static void main(String[] args) {
        List<Fruta> frutas = new ArrayList<>();
        frutas.add(new Fruta("sandia", 52));
        frutas.add(new Fruta("platano", 89));
        frutas.add(new Fruta("naranja", 47));
        frutas.add(new Fruta("uva", 69));
        frutas.add(new Fruta("mango", 57));
        frutas.add(new Fruta("papaya", 40));
        frutas.add(new Fruta("frutilla", 50));
        List<Fruta> frutasConMasDe50Calorias = frutas.stream()
                .filter(fruta -> fruta.getCaloriasPorPorcion() > 50)
                .collect(Collectors.toList());

        System.out.println("Frutas con más de 50 calorías por porción:");
        for (Fruta fruta : frutasConMasDe50Calorias) {
            System.out.println(fruta.getNombre() + ": " + fruta.getCaloriasPorPorcion() + " calorías por porción");
        }
    }
}