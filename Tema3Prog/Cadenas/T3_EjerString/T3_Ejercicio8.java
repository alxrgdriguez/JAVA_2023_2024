package Tema3Prog.Cadenas.T3_EjerString;

import java.util.Arrays;

public class T3_Ejercicio8 {

    public static void dividirPalabras(String cadena){



    }

    public static void main(String[] args) {
        
        /**
         * Ejercicio 8. Divide la cadena “http://www.iesjaroso.es/noticias” en “http”, “www.iesjaroso.es”, “noticias”.
         */

        String cadena = "http://www.iesjaroso.es/noticias";
        String[] parts = cadena.split("\\|"); 
       
        System.out.println(Arrays.asList(parts));

    }
    
}
