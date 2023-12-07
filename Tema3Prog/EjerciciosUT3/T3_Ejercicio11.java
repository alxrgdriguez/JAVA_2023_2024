package Tema3Prog.EjerciciosUT3;

public class T3_Ejercicio11 {

    /**
     * Función para pintar por consola los valores de una matriz de enteros
     * @param matriz
     *      */
    public static void pintarMatriz(int[][] matriz) {
        for(int i=0; i<matriz.length; i++) {
            
            for(int j=0; j<matriz[0].length; j++) {
                if(matriz[i][j] <= 9){
                    System.out.print(" " + matriz[i][j] + " ");
                }else{
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        /**
         *Ejercicio 11. Crear una tabla bidimensional de tamaño 5x5 y rellenarla de forma que los elementos de la diagonal principal
          sean 1 y el resto 0. Mostrarla.
         */

        int[][] matriz = new int[5][5];
        
        for (int i = 0; i < matriz.length; i++){

            for (int j = 0; j < matriz[i].length; j++){

                matriz[i][j] = 0;
                matriz[i][i] = 1;
            }

        }

        System.out.println("--- MATRIZ ---");
        pintarMatriz(matriz);

    }

}
