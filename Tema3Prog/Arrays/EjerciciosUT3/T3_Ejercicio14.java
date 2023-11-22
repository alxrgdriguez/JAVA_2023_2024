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

    }
    
}
