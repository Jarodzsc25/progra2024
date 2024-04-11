package metodosYfunciones;

public class SumaMatriz {
    public static int[][] sumarMatrices(int[][] matrizA, int[][] matrizB) {
        int filas = matrizA.length;
        int columnas = matrizA[0].length;
        int[][] resultado = new int[filas][columnas];
        /*matriz.length devuelve el número de filas en la matriz y matriz[0].length
         devuelve el número de columnas en la primera fila
         (asumiendo que todas las filas
        tienen la misma cantidad de columnas, lo que es común en una matriz).*/
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        int[][] matrizA = {{1, 2, 2}, {5, 5, 6}, {8, 8, 9}};
        int[][] matrizB = {{9, 8, 4}, {6, 5,6}, {6, 2, 1}};

        int[][] resultado = sumarMatrices(matrizA, matrizB);

        for (int i = 0; i < resultado.length; i++) {
            for (int j = 0; j < resultado[0].length; j++) {
                System.out.print(resultado[i][j] + " ");
            }
            System.out.println();
        }
    }
}
