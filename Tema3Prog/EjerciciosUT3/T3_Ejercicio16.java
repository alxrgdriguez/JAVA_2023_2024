package Tema3Prog.EjerciciosUT3;

public class T3_Ejercicio16 {

    /**
     * Función para pintar por consola los valores de una matriz de enteros
     *
     * @param matriz
     */
    public static void pintarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] <= 9) {
                    System.out.print("0" + matriz[i][j] + " ");
                } else {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();
        }
    }


    public static boolean siRepite(int[][] matriz, int numero){

        for(int i = 0; i < matriz.length; i++){

            for(int j = 0; j < matriz[i].length; j++){

                if(numero == matriz[i][j]){

                    return true;

                }

            }
        }

        return false;

    }


    public static int numAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static void main(String[] args) {

        /**
         * Ejercicio 16. Crea una matriz de 3x6 números enteros aleatorios no repetidos
         */

        int[][] matriz = new int[3][6];
        int numero = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                do {

                    numero = numAleatorio(1, 50);
                    
                } while (siRepite(matriz, numero));

                matriz[i][j] = numero;

            }
        }

        // Pintamos la matriz rellenada con números aleatorios
        System.out.println("\n----- MATRIZ ----");
        pintarMatriz(matriz);
    }
}
