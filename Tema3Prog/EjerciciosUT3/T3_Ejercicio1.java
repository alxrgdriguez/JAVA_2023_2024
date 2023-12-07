package Tema3Prog.EjerciciosUT3;

import java.util.Arrays;

public class T3_Ejercicio1 {


    public static int numaleatorio(int min, int max){

        return (int) (Math.random() * (max - min + 1) + min);

    }

    public static void main(String[] args) {
        
        /**
         * 1. Programa Java que guarda en un array 20 números enteros que se generen aleatoriamente entre -100 y 100. A
          continuación, se recorre el array y calcula cuántos números son positivos y cuántos negativos.
         */

         int[] numeros = new int[20];
         int contador = 0;
         int contadorNegativo = 0;
        

         for(int i = 0; i < numeros.length; i++){

            numeros[i] = numaleatorio(-100, 100);

        }

        for(int i = 0; i < numeros.length; i++){

            if(numeros[i] >= 0){

                contador++;

            }else {

                contadorNegativo++;
            }

        }

        System.out.println(Arrays.toString(numeros));
        System.out.println("Hay " + contador + " numeros positivos");
        System.out.println("Hay " + contadorNegativo + " numeros negativo");
    }
    
}
