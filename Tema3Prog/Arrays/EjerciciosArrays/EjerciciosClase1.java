package Tema3Prog.Arrays.EjerciciosArrays;

import java.util.Arrays;

public class EjerciciosClase1 {

    public static void main(String[] args) {
        
        /*1. Crea de 20 int y rellenalo con el numero 0. Píntalo. Ahora consigue 
         * que los elementos en posiciones pares tengan el valor el valor -1
         */

         int[] numeros = new int[100];

         for(int i = 0; i < numeros.length; i++){

            Arrays.fill(numeros, 1);
         }

        
        for(int i = 0; i < numeros.length; i++){

            if (i %2 == 0){

                numeros[i] = -1;


            }

        }


         System.out.println(Arrays.toString(numeros));
         


    }
    
}
