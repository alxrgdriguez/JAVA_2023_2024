package Tema3Prog.Arrays.EjerciciosArrays;

import java.util.Arrays;

public class Ejercicio3 {


    public static void main(String[] args) {
        
        //1. Crea un array que tenga todos los numeros del 1 al 100
        //2. Crea un array de int de 50 elementos y llámalo pares
        //3. Crea un array de int 50 elementos y llámalo impares
        //4. Rellenar el array "pares" con los numeros pares del primer array


        int[] numeros = new int[100];
        int[] pares = new int[50];
        int[] impares = new int[50];
        int contadorPares = 0;
        int contadorImpares = 0;

        for(int i=0; i< numeros.length; i++) {
            numeros[i] = i +1;
        }

        for(int i = 0; i < numeros.length; i++){

            if (numeros[i] %2 == 0) {

               pares[contadorPares] = numeros[i];
               contadorPares++;

            }

            if (numeros[i] %2 != 0){

                impares[contadorImpares] =  numeros[i];
                contadorImpares++;
            }

        }  

        System.out.println("Impares: ");
        System.out.println(Arrays.toString(impares));
        System.out.println("Pares");
        System.out.println(Arrays.toString(pares));
      
    }
}
    

