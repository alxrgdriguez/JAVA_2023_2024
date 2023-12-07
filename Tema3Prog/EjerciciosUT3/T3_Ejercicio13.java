package Tema3Prog.EjerciciosUT3;

import java.util.Scanner;

public class T3_Ejercicio13 {

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
         * Ejercicio 13. Crear una tabla bidimensional de tamaño 3x4 de números enteros (leídos desde teclado). Mostrar la matriz y la
           suma de los valores de cada fila.  
         */

        Scanner sc = new Scanner(System.in);

        int[][] numeros = new int[3][4];


        for(int i = 0; i < numeros.length; i++){

            for(int j = 0; j < numeros[i].length; j++){

                System.out.print("Introduce el numero que contendrá la matriz: ");
                numeros[i][j] = Integer.parseInt(sc.nextLine());
            }

        }

         //Mostramos la matriz generada Sumada

         System.out.println("\n---- MATRIZ ----");
         pintarMatriz(numeros);
         System.out.println();

        // Calculamos la suma de los valores de cada fila
        int[] suma = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {

            suma[i] = 0;

            for (int j = 0; j < numeros[i].length; j++) {
                suma[i] += numeros[i][j];
            }
        }

        // Imprimimos la suma de los valores de cada fila
        System.out.println("La suma de los valores de cada fila es:");

        for(int i = 0; i < suma.length; i++){

            System.out.println("Posicion " + (i+1) + " = " + suma[i]);
        }

        sc.close();
    }
    
}
