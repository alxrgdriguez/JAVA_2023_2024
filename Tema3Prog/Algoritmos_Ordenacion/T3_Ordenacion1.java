package Tema3Prog.Algoritmos_Ordenacion;

import java.util.Arrays;

public class T3_Ordenacion1 {


    public static int numaleatorio(int min, int max){

        return (int) (Math.random() * (max - min + 1) + min);

    }

    public static int[] metodoBurbuja(int[] numero){

        int temp = 0;

        //Damos tantas pasadas como posiciones tenga el array
        for (int i = numero.length; i > 0; i--) {
            
            for (int j = 0; j < i-1; j++) {
                
                if (numero[j]>numero[j+1]) {

                    //Intercambiamos valores

                    temp = numero[j+1];
                    numero[j+1] = numero[j];
                    numero[j] = temp;
                    
                }
            }

        }

        return numero;
        
    }

    public static void main(String[] args) {
        
        /**
         * Ejercicio 1. Realiza un programa que cree un array de 50 posiciones cargado con valores aleatorios. Los valores
          aleatorios deberán estar entre el 1 y el 100. Una vez cargado el vector, deberá ordenarlo mediante el
          método de la burbuja y mostrarlo ordenado por pantalla. Para el método de la burbuja deberás crear
          una función que reciba un array de números y lo devuelva ordenado.

         */

        int[] numero = new int[50];

        for (int i = 0; i < numero.length; i++) {
            
            numero[i] = numaleatorio(1, 100);
        }

        System.out.println("Array sin Ordenar");
        System.out.println(Arrays.toString(numero));

        System.out.println("Array cambiado por método burbuja");
        System.out.println(Arrays.toString(metodoBurbuja(numero)));


    }
    
}
