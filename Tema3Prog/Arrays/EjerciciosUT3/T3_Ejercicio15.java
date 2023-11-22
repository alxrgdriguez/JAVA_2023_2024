public class T3_Ejercicio15 {
    
    public static int numaleatorio(int min, int max){

        return (int) (Math.random() * (max - min + 1) + min);

    }

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
         * Crear dos matrices 3x3 de números enteros (generadas aleatoriamente), pintarlas, sumarlas y mostrar su suma. El
           resultado será también una matriz (suma) donde cada elemento será la suma de los elementos de las otras
           matrices en la misma posición.
         */

         int[][] matriz1 = new int[3][3];
         int[][] matriz2 = new int[3][3];


        //Rellenamos la matriz1 de numeros aleatorios
        for(int i = 0; i < matriz1.length; i++){

            for(int j = 0; j < matriz1.length; j++){

                matriz1[i][j] = numaleatorio(10, 99);

            }
        }

        System.out.println();
        System.out.println("--- MATRIZ 1 --");
        pintarMatriz(matriz1);

        //Rellenamos la matriz1 de numeros aleatorios   
        for(int i = 0; i < matriz2.length; i++){

            for(int j = 0; j < matriz2.length; j++){

                matriz2[i][j] = numaleatorio(10, 99);

            }
        }

        System.out.println();
        System.out.println("--- MATRIZ 2 --");
        pintarMatriz(matriz2);



    }
}
