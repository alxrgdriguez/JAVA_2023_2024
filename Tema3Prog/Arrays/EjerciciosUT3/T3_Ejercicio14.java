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


    public static int mediaMatriz(int matriz[][] )

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

        System.out.println("-- MATRIZ --");
        pintarMatriz(numeros);

        System.out.println();
        System.out.println("El numero maximo de la matriz es: " + maximoMatriz(numeros));
        System.out.println("El numero minimo de la matriz es: " + minimoMatriz(numeros));
        System.out.println("La media entre el maximo  " + maximoMatriz(numeros) + " y el minimo " + minimoMatriz(numeros) + " es: " );

    }
    
}
