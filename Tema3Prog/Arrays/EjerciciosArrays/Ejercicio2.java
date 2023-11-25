package Tema3Prog.Arrays.EjerciciosArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ejercicio2 {

    public static void main(String[] args) {
        
        //Crea un array que tenga dentro todos los numeros del 1 al 100

        int[] numeros = new int[100];

        
        for(int i = 0; i < numeros.length; i++){

            //Le sumamos 1, porque va de 0 a 99, y queremos de 1 a 100
            numeros[i] = i + 1;
        }

        //Mostramos los numeros del 1 al 100
        System.out.println(Arrays.toString(numeros));

    }
    
}
