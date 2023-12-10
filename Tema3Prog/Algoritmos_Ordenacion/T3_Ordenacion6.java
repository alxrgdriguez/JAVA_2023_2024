package Tema3Prog.Algoritmos_Ordenacion;

import java.util.Arrays;

public class T3_Ordenacion6 {

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
         * Ejercicio 6. Realiza un programa que cree un vector de 100 posiciones con números aleatorios entre 1 y 100. Una
           vez creado el vector, el programa deberá ordenarlo y mostrar los números entre 1 y 100 que no han
           sido almacenados. Ten en cuenta a la hora de buscar un número en un array que no tienes que
           comparar con todo el array puesto que ya está ordenado.
         */

        int[] numeros = new int[100];

        for (int i = 0; i < numeros.length; i++) {
            
            numeros[i] = numaleatorio(1, 100);

        }

        metodoBurbuja(numeros);

        System.out.println(Arrays.toString(numeros));

        for (int i = 1; i <= 100; i++) {
            //Comprobamos si el numero actual esta en el array. Si binarySeach devuelve un valor menor que 0, el elemento, no esta en el array.
            if (Arrays.binarySearch(numeros, i) < 0) {
                System.out.print(i + " ");
            }
        }

    }
    
}
