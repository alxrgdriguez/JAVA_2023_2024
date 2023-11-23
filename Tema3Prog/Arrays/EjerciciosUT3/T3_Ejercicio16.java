import java.util.HashSet;
import java.util.Set;

public class T3_Ejercicio16 {

    public static void main(String[] args) {
        // Crear una matriz de 3x6
        int filas = 3;
        int columnas = 6;
        int[][] matriz = new int[filas][columnas];

        // Llenar la matriz con números aleatorios no repetidos
        llenarMatriz(matriz);

        // Mostrar la matriz
        System.out.println("-- MATRIZ --");
        pintarMatriz(matriz);
    }

    // Función para llenar la matriz con números aleatorios no repetidos
    public static void llenarMatriz(int[][] matriz) {
        Set<Integer> numerosUtilizados = new HashSet<>();
        int min = 1;
        int max = 100;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int numeroAleatorio;
                while (true) {
                    numeroAleatorio = numAleatorio(min, max);
                    if (!numerosUtilizados.contains(numeroAleatorio)) {
                        break;
                    }
                }

                matriz[i][j] = numeroAleatorio;
                numerosUtilizados.add(numeroAleatorio);
            }
        }
    }

    // Función para generar un número aleatorio en un rango
    public static int numAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    // Función para imprimir la matriz
    public static void pintarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] <= 9) {
                    System.out.print("0" + matriz[i][j] + " ");
                } else {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
