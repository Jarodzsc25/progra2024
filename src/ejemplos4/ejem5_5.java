package ejemplos4;

public class ejem5_5 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 0, 0, 4}, {5, 1, 7, 8},
                {0, 9, 0, 0}, {2, 3, 0, 0}};
        int contadorCeros = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 0) {
                    contadorCeros++;
                }
            }
        }
        System.out.println("Cantidad de ceros en la matriz: " + contadorCeros);
    }
}
