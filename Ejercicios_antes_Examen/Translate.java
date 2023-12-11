package Ejercicios_antes_Examen;

import java.util.Arrays;

public class Translate {
    
    /**
     *  Dos arrays de 20 palabras, uno español y otro con la traducción en inglés
     *  Le decimos una palabra y tiene que devolver la traducción
     * 
     */
    public static String translate(String palabra) {
        String trad = "";

        String spanish[] = { "casa", "coche", "perro", "gato", "mesa", "silla", "caballo", "vaca", "leon", "tigre" };

        String english[] = { "house", "car", "dog", "cat", "table", "chair", "horse", "cow", "lion", "tiger" };

        //Buscar palabra en spanish --> BinarySearch, sort
        int posicion = -1;
        for(int i=0; i < spanish.length; i++) {
            if (spanish[i] == palabra) {
                posicion = i;
                break;
            }
        }

        if (posicion == -1) {
            return "Not found";
        } else {
            return english[posicion];
        }
    }


    public static void main(String[] args) {
        
        System.out.println(translate("ratón"));


    }
}
