package Tema3Prog.Algoritmos_Ordenacion;

import java.util.Arrays;

public class T3_Ordenacion2 {

    public static int numaleatorio(int min, int max){

        return (int) (Math.random() * (max - min + 1) + min);

    }

    public static int[] metodoBurbuja(int[] numero){
       boolean ordenado = true;
        int temp = 0;

        //Mientras haya algo para ordenar
        while(ordenado){
            ordenado = false;
            for (int j = 0; j < numero.length -1; j++) {
                if (numero[j]>numero[j+1]) {
                    ordenado = true;
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
         * Ejercicio 2. Mejora el método de la burbuja explicado anteriormente y utiliza una variable a modo de centinela o
          flag, de tal manera que ésta se active cuando hay algún intercambio. En el momento que no haya
          ningún intercambio, el algoritmo debería parar puesto que el vector ya está ordenado.
         */

        int[] numero = new int[10];

        for (int i = 0; i < numero.length; i++) {
            
            numero[i] = numaleatorio(1, 100);
        }

        System.out.println("Array sin Ordenar");
        System.out.println(Arrays.toString(numero));

        System.out.println("Array cambiado por método burbuja");
        System.out.println(Arrays.toString(metodoBurbuja(numero)));
    }
    
}
