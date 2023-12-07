package Tema3Prog.EjerciciosUT3;

import java.util.Arrays;

public class T3_Ejercicio10 {

     
    /**
     * Función para pintar por consola los valores de una matriz de enteros
     * @param matriz
     *      */
    public static void pintarMatriz(int matriz[][]) {
        for(int i=0; i<matriz.length; i++) {
            for(int j=0; j<matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }


    public static int numAleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }


    public static boolean siRepite(int[] numLoteria, int numero){

        for (int i = 0; i < numLoteria.length; i++){

                if(numLoteria[i] == numero){

                    return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        
        /**
        *Ejercicio 10. Realiza una función que devuelva un array con una combinación de la Lotería Primitiva (6 números entre 1 y 49).
        La particularidad es que los números no deben estar repetidos
         */

        int[] numLoteria = new int[6];
        int numero = 0;

        for (int i = 0; i < numLoteria.length; i++) {

            do {

                numero = numAleatorio(1, 49);
                
            } while (siRepite(numLoteria, numero));

            numLoteria[i] = numero;

                
           
        }

        // Pintamos la matriz rellenada con números aleatorios
        System.out.println("\n   --- Nº LOTERIA ---");
        System.out.println(Arrays.toString(numLoteria));

    }
    
}
