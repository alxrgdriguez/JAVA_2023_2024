package Tema3Prog.Algoritmos_Ordenacion;

import java.util.Arrays;

public class T3_Ordenacion3 {

    public static int numaleatorio(int min, int max){

        return (int) (Math.random() * (max - min + 1) + min);

    }

    public static int[] metodoBurbuja(int[] numero1, int[] numero2){
        int temp = 0;

        //Creamos un array final con el tamaño total de los 2 arrays pasados por parametros
        int[] numero = new int[numero1.length + numero2.length];

        //Añadimos los elementos del array numero1 al array final
        for(int i = 0; i< numero1.length; i++){
            numero[i] = numero1[i];
        }

         //Añadimos los elementos del array numero2 al array final
        for(int i = 0; i<numero2.length; i++){
            numero[numero1.length+i] = numero2[i];
        }
        System.out.println(Arrays.toString(numero));
        System.out.println("Array Ordenado");
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
         * Ejercicio 3. Realiza un método que tome como parámetros de entrada dos arrays de enteros y devuelva como
        salida un único array con los dos elementos de los anteriores arrays ordenados de forma ascendente.
         */

        int[] numero1 = new int[4];

        for (int i = 0; i < numero1.length; i++) {
            
            numero1[i] = numaleatorio(1, 100);
        }

        int[] numero2 = new int[3];

        for (int i = 0; i < numero2.length; i++) {
            
            numero2[i] = numaleatorio(1, 100);
        }

        System.out.println(Arrays.toString(numero1));
        System.out.println(Arrays.toString(numero2));
        System.out.println(Arrays.toString(metodoBurbuja(numero1, numero2)));
    }
    
}
