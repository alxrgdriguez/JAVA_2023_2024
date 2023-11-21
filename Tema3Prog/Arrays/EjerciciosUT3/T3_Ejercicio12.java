import java.util.Arrays;

public class T3_Ejercicio12 {

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

    public static int numaleatorio(int min, int max){

        return (int) (Math.random() * (max - min + 1) + min);

    }


    public static void main(String[] args) {
        
        /**
         * Ejercicio 12. Crear una matriz “marco” de tamaño 8x6. Una matriz “marco” es aquella que todos sus elementos son 0 salvo los
          de los bordes que deben ser 1. Mostrarla.
         */

         int[][] matrizMarco = new int[8][6];

         for(int i = 0; i < matrizMarco.length;i++){

            for (int j = 0; j < matrizMarco[i].length; j++){

                matrizMarco[i][j] = numaleatorio(1, 99);
            }
         }

        System.out.println("--- MATRIZ ---");
        pintarMatriz(matrizMarco);


    }
    
}
