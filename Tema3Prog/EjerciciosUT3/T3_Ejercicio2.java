package Tema3Prog.EjerciciosUT3;

import java.util.Arrays;

public class T3_Ejercicio2 {

    public static int[] devolverArrays(int[] numero) throws Exception{


    //Comprobamos que el array no es de 10, para que salte un error
    if(numero.length != 10){

        throw new Exception("El tamaño del array no coincide con 10");
    }

    //Creamos una variable temporal para guardar el valor de la posición 0 del array
    int num = numero[0];
    //A la primera posición del array le asignamos el valor de la última posición
    numero[0] = numero[numero.length - 1]; // ULTIMA POSICIÓN: NOMBRE_DEL_ARRAY.length -1
    
    //A la ultima posición le asignamos el valor de la primera posición que se ha guardado en la variable temporal
    numero[numero.length - 1] = num;

    return numero;
    
    }

    public static void main(String[] args) {
        
        /**
         * Ejercicio 2
         * Crea una función que reciba como parámetro un array de 10 enteros, debe devolver el mismo array donde se
           hayan intercambiado el primer elemento y el último elemento
         */

        int[] numero = new int[10];

        for(int i=0; i<numero.length;i++){
            numero[i] = i+1;
        }


        System.out.println(Arrays.toString(numero));
        try {
            System.out.println(Arrays.toString(devolverArrays(numero)));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        


    }
    
}
