package Tema3Prog.Algoritmos_Ordenacion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class T3_Ordenacion5 {

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
         * Ejercicio 5. Realiza un programa que cree 100 números aleatorios entre 1 y 1000 y que muestre los 10 mayores
         */

        int[] numero = new int[100];

        for (int i = 0; i < numero.length; i++) {
            
            numero[i] = numaleatorio(1, 100);
        }

        metodoBurbuja(numero);

        System.out.println(Arrays.toString(numero));

        //Bucle para buscar los 10 mayores, se empieza desde la ultima posicion
        int contador = 0;
        int[] numeros10 = new int[10];
        int ultimo = -1;
        for(int i = numero.length-1; i>=0; i--){

            if(contador == numeros10.length){
                break;
            }else{
                //Comprobamos si el ultimo numero es distinto al actual (para no tener el caso de numeros repetidos como por ejemplo 50,50,50)
                if(numero[i] != ultimo){
                    //Añadimos a nuestro array temporal el numero actual
                    numeros10[contador] = numero[i];
                    ultimo = numero[i];
                    contador++;
                }
            }
        }

        System.out.println(Arrays.toString(metodoBurbuja(numeros10)));




    }
    
}
