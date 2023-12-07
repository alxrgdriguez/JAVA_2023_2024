package Tema3Prog.EjerciciosUT3;

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

         // Recorremos la matriz
        for (int i = 0; i < matrizMarco.length; i++) {
            for (int j = 0; j < matrizMarco[i].length; j++) {
                
                // Si estamos en el borde de la matriz, ponemos un 1
                if (i == 0 || i == matrizMarco.length - 1 || j == 0 || j == matrizMarco[i].length - 1) {
                    matrizMarco[i][j] = 1;
                } else {
                    // En el resto de la matriz, ponemos un 0
                    matrizMarco[i][j] = 0;
                }
            }
        }

        System.out.println("----- MATRIZ -----");
        pintarMatriz(matrizMarco);


    }
    
}
