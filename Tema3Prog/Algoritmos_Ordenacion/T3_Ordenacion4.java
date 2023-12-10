package Tema3Prog.Algoritmos_Ordenacion;

import java.util.Arrays;

public class T3_Ordenacion4 {

    public static int numaleatorio(int min, int max){

        return (int) (Math.random() * (max - min + 1) + min);

    }

    public static void main(String[] args) {
        

        /**
         * Ejercicio 4. Realiza un programa que cree un vector de 50 posiciones con número aleatorios entre 1 y 50. Una vez
        creado el vector, el programa deberá mostrar el mayor, el menor y la media de los valores almacenados
        en el array
         */

        int[] numero = new int[50];
        int mayor = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int media = 0;

        for (int i = 0; i < numero.length; i++) {
        
        numero[i] = numaleatorio(1, 50);
        }

        System.out.println("ARRAY SIN ORDENAR");
        System.out.println(Arrays.toString(numero));

        Arrays.sort(numero);

        menor = numero[0];
        mayor = numero[numero.length-1]; 

        for (int i = 0; i < numero.length; i++) {
         
            media += numero[i];
            
        }

        media /= numero.length;

        System.out.println("ARRAY ORDENADO");
        System.out.println(Arrays.toString(numero));

        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
        System.out.println("La media es: " + media);




    }
    
}
