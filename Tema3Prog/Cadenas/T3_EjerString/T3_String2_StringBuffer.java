package Tema3Prog.Cadenas.T3_EjerString;

import java.util.Scanner;

public class T3_String2_StringBuffer {

    public static void main(String[] args) {
        
        /**
         * Ejercicio 2. . Crea un programa que reciba una cadena de caracteres y la devuelva invertida con efecto espejo, este
           es, se concatena a la palabra original su inversa, compartiendo la última letra, que hará de espejo, por
           lo que la palabra obtenida se lee igual hacia adelante que hacia atrás. Por ejemplo, al introducir
           “teclado” devolverá “tecladodalcet” y al introducir “hola” devolverá “holaloh”. Haz dos versiones, una
           con String y otra con StringBuffer.
         */

        Scanner sc = new Scanner(System.in);

        StringBuffer cadena = new StringBuffer();
        StringBuffer cadenaTemp = new StringBuffer();

        System.out.println("Introduce la cadena de carácteres: ");
        cadena.append(sc.nextLine());
        
        cadenaTemp.append(cadena);//No usar = para darle el mismo valor, porque sino luego al hacer una manipulacion, se hace en los 2

        cadenaTemp.reverse();

        cadena.deleteCharAt(cadena.length()-1);
        
        System.out.println(cadena.append(cadenaTemp));

        sc.close();
    }
    
}
