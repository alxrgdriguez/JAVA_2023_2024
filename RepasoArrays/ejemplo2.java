package RepasoArrays;

import java.util.Arrays;

public class ejemplo2 {

    public static void main(String[] args) {
        
        /**
         * Ejercicio 3.En Java existe una clase estática llamada Arrays que nos permite hacer varias
            cosas con arrays:
            a. Arrays.fill(array, valor): llena un array con un valor pasado como parámetro
            b. Arrays.sort(array): el array que se le pasa como parámetro queda ordenado
            c. Arrays.toString(array): pasa un array a String con sus elementos
            d. Arrays.copyOf(array): devuelve un array nuevo igual que el que se le pasa
            (1 punto) Realiza las siguientes tareas usando los métodos anteriores:

            a. Crear un array de 50 elementos de tipo int, declarar el array
            b. Rellena el array con el valor 100. Arrays.fill
            c. Pinta el vector con Arrays.toString
            d. Ordena el vector. Arrays.sort
            e. Pinta el vector con Arrays.toString
            f. Crea una copia del vector usando Arrays.copyOf.
            g. Pinta el vector copiado con Arrays.toString
         */

        //Ejercicio1.a

        int[] numero = new int[50];

        //Ejercicio1.b

        Arrays.fill(numero, 100);

        //Ejercicio1. c

        System.out.println("----------------------");
        System.out.println(Arrays.toString(numero));

        //Ejercicio1. d
        numero[2] = 20;
        numero[3] = 150;
        Arrays.sort(numero);

        //Ejercicio1. e

        System.out.println("----------------------");
        System.out.println(Arrays.toString(numero));

        //Ejercicio1. f

        int[] copia = Arrays.copyOf(numero, 50);

        //Ejercicio1. g

        System.out.println("----------------------");
        System.out.println(Arrays.toString(copia));













    }

    
}
