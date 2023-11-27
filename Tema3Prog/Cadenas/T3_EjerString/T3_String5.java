package Tema3Prog.Cadenas.T3_EjerString;

import java.util.Scanner;

public class T3_String5 {

    /**
     * Función para contar vocales, consonantes y espacios
     * @param cadena
     */
    private static void contarVocalesConsonantesEspacios(String cadena) {
        int contVocales = 0;
        int contConsonantes = 0;
        int contEspacios = 0;

        // Convertimos la cadena a minúsculas para simplificar la comparación
        cadena = cadena.toLowerCase();
    
        // Recorrer cada carácter en la cadena

        for (int i = 0; i < cadena.length(); i++) {

            //Extraemos el carácter que se encuentra en la posición específica dentro de la cadena.
            char caracter = cadena.charAt(i);

            // Haremos una condición para ver si el caracter es una vocal
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
              
                contVocales++;
                
            // Verificar si el carácter es una consonante (letra que no es vocal)
            }else if(caracter >= 'a' && caracter <= 'z'){
                
                contConsonantes++;

            //Comprobamos si el carácter es un espacio en blanco
            }else if (caracter == ' ') {
                
                contEspacios++;

            }

        }

        System.out.println("Hay " + contVocales + " vocale/s");
        System.out.println("Hay " + contConsonantes + " consonante/s");
        System.out.println("Hay " + contEspacios + " espacio/s en blanco");
        
    }
    public static void main(String[] args) {
        
        /**
         * Ejercicio 5. Diseña un programa en Java que solicite al usuario una cadena de caracteres y muestre por pantalla un
           conteo de cuántas vocales, consonantes y espacios en blanco contiene la cadena introducida
         */

        Scanner sc = new Scanner(System.in);

        String cadena = "";

        System.out.println("Introduce la frase: ");
        cadena = sc.nextLine();

        contarVocalesConsonantesEspacios(cadena);
      
        sc.close();
    }
    
}
