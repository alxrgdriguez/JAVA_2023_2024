package Tema3Prog.Cadenas.T3_EjerString;

import java.util.Scanner;

public class T3_String6 {

    // Método para verificar si una cadena es un palíndromo
    public static boolean esPalindromo(String cadenaRemplazada) {
        // Eliminar espacios y convertir a minúsculas para hacer la comparación a mayúsculas
        String cadena = cadenaRemplazada.replaceAll("\\s", "").toLowerCase();
        
        // Obtener la longitud de la cadena
        int longitud = cadena.length();
        
        // Verificar palíndromo comparando los caracteres desde ambos extremos hacia el centro
        for (int i = 0; i < longitud / 2; i++) {
            if (cadena.charAt(i) != cadena.charAt(longitud - 1 - i)) {
                return false; // No es un palíndromo
            }
        }
        return true; // Es un palíndromo
    }

    public static void main(String[] args) {
        
        /**
         * Ejercicio 6. Crea un método que determine si una cadena es un palíndromo, o sea, se lee igual en los dos sentidos
         */

        Scanner sc = new Scanner(System.in);

        //Declaramos nuestra cadena
        String cadena = "";

        //Pedimos al usuario la palabra
        System.out.println("Introduce un palabra: ");
        cadena = sc.nextLine();

        if (esPalindromo(cadena)) {
            System.out.println(cadena + " es un palíndromo.");
        } else {
            System.out.println(cadena + " no es un palíndromo.");
        }

        sc.close();
    }
    
}
