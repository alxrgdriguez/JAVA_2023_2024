public class Ejercicio10 {


      /**
     * Función para pintar por consola los valores de una matriz de enteros
     * @param matriz
     **/
     public static void pintarMatriz(int[][] matriz){

        for(int i = 0; i < matriz.length; i++){

            for(int j = 0; j < matriz[j].length; i++){

                if(matriz[i][j] <= 9){

                    System.out.print("0" + matriz[i][j] + " ");
                }else{
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
    }


    public static int numAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }



    public static void main(String[] args) {
        
        /**
        *Ejercicio 10. Realiza una función que devuelva un array con una combinación de la Lotería Primitiva (6 números entre 1 y 49).
        La particularidad es que los números no deben estar repetidos
         */

        int[][] numLoteria = new int[6][6];


    }
    
}
