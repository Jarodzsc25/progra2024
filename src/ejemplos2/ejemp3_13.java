package ejemplos2;

import java.util.Scanner;

public class ejemp3_13 {
    public static void main(String[] args) {
        int claveArticulo;
        double costoMateriaPrima;
        double costoManoObra = 0;
        double gastoFabricacion = 0;
        double costoProduccion;
        double precioVenta;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la clave del artículo: ");
        claveArticulo = scanner.nextInt();

        System.out.print("Ingrese el costo de la materia prima: ");
        costoMateriaPrima = scanner.nextDouble();
        switch (claveArticulo) {
            case 3:
            case 4:
                costoManoObra = 0.75 * costoMateriaPrima;
                break;
            case 1:
            case 5:
                costoManoObra = 0.80 * costoMateriaPrima;
                break;
            case 2:
            case 6:
                costoManoObra = 0.85 * costoMateriaPrima;
                break;
        }
        switch (claveArticulo) {
            case 2:
            case 5:
                gastoFabricacion = 0.30 * costoMateriaPrima;
                break;
            case 3:
            case 6:
                gastoFabricacion = 0.35 * costoMateriaPrima;
                break;
            case 1:
            case 4:
                gastoFabricacion = 0.28 * costoMateriaPrima;
                break;
        }
        costoProduccion = costoMateriaPrima + costoManoObra + gastoFabricacion;
        precioVenta = costoProduccion + (costoProduccion * 0.45);
        System.out.println("Costo de producción: $" + costoProduccion);
        System.out.println("Precio de venta: $" + precioVenta);
    }
}
