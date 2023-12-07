package Tema3Prog.EjerciciosUT3;

public class T3_Ejercicio14 {

    
   /**
     * Función para pintar por consola los valores de una matriz de enteros
     * @param matriz
     *      */
    public static void pintarMatriz(int[][] matriz) {
        for(int i=0; i<matriz.length; i++) {
            
            for(int j=0; j<matriz[0].length; j++) {
                if(matriz[i][j] <= 9){
                    System.out.print("0" + matriz[i][j] + " ");
                }else{
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    /**
     * Función que devuelve el menor numero de una matriz
     * @param matriz Elementos de la matriz 
     * @return Devuelve el mínimo de la matriz
     */
    public static int minimoMatriz(int matriz[][]){

        int minimo = Integer.MAX_VALUE;

        for(int i = 0; i < matriz.length; i++){

            for(int j = 0; j < matriz[0].length; j++){

                //Decimos cual es el minimo

                if(matriz[i][j] < minimo){

                    minimo = matriz[i][j];
                }
            }
        }
        return minimo;
    }

    public static int maximoMatriz(int matriz[][]){

        int maximo = Integer.MIN_VALUE;

        for(int i = 0; i < matriz.length; i++){

            for(int j = 0; j < matriz[0].length; j++){

                //Decimos cual es el maximo

                if(matriz[i][j] > maximo){

                    maximo = matriz[i][j];
                }
            }
        }

        return maximo;

    }

    /**
     * Función que devuelve la media de toda la matriz
     * @param matriz
     * @return Devuelve la media 
     */
    public static double mediaMatriz(int[][] matriz){

        double media = 0;
        int contador = 0;

        for(int i = 0; i < matriz.length; i++){

            for(int j = 0; j < matriz[i].length; j++){

                media += matriz[i][j];
                contador++;

            }
        }

        media /= contador;

        return media;

    }

    public static int numaleatorio(int min, int max){

        return (int) (Math.random() * (max - min + 1) + min);

    }

    public static void main(String[] args) {
        

        /**
         * Ejercicio14. Crear una matriz 5x3 de números enteros (aleatorios) y mostrar el menor, el mayor y la media de los elementos.
         */

         int [][] numeros = new int[5][3];

         for(int i = 0; i < numeros.length; i++){

            for (int j = 0; j < numeros[i].length; j++){

                numeros[i][j] = numaleatorio(10, 99);
            }
         }

        //Imprimimos la matriz generada aleatoriamente
        System.out.println("-- MATRIZ --");
        pintarMatriz(numeros);

        //Imprimimos los resultados
        System.out.println();
        System.out.println("El numero maximo de la matriz es: " + maximoMatriz(numeros));
        System.out.println("El numero minimo de la matriz es: " + minimoMatriz(numeros));
        System.out.println("La media de todos los elementos de la matriz es: " + mediaMatriz(numeros));

    }
    
}
