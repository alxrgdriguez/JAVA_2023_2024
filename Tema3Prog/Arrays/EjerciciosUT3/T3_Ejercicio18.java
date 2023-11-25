public class T3_Ejercicio18 {

     /**
     * Función para generar numeros aleatorios entre un mínimo y un maximo
     * @param min Desde el menor numero (rango)
     * @param max Hasta el maximo (rango)
     * @return Devuelve los numeros aleatorios generados automáticamente
     */
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
         * Ejercicio 18. Escribe un programa que genere al azar 20 números enteros comprendidos entre 0 y 9. Estos números se deben
           introducir en un array de 4 filas por 5 columnas.
           El programa mostrará las sumas parciales de filas y columnas igual que si de una hoja de cálculo se tratara. La
          suma total debe aparecer en la esquina inferior derecha.
         */

         int[][] matriz = new int[4][5];
         int[][] matriz2 = new int[5][6];

        for (int i = 0; i < matriz.length; i++) {
        
            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = numaleatorio(0, 9);
            
            }  
        }

        for (int i = 0; i < matriz2.length; i++) {
            
            for (int j = 0; j < matriz2[i].length; j++) {
                
                
            }
        }


        pintarMatriz(matriz);


    }
    
}
