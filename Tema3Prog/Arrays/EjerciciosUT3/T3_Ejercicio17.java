import java.lang.reflect.Array;
import java.util.Arrays;

public class T3_Ejercicio17 {

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
        

        /**Ordenar matrices. Crea una matriz de enteros de dos dimensiones de 50x50 elementos, rellénala con números
        aleatorios entre 1 y 500. A continuación, realiza dos funciones:
        a. ordenaFilas(matriz): que ordene la matriz por filas, cada fila de la matriz quedará ordenada de menor a
        mayor.
        b. ordenaColumnas(matriz): que ordene la matriz por columnas, cada columna quedará ordenada de
        menor a mayor, independientemente de las demás.
        */


        int[][] matriz = new int[50][50];

        for (int i = 0; i < matriz.length; i++) {
            
            for (int j = 0; j < matriz[0].length; j++) {
                
                matriz[i][j] = numaleatorio(1, 500);

            }
        }

        //Ordenamos la matriz
        Arrays.sort(matriz);
        
        //Pintamos la matriz
        System.out.println();
        pintarMatriz(matriz);

    }
    
}
