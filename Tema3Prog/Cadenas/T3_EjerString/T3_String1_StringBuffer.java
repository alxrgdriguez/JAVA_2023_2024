package Tema3Prog.Cadenas.T3_EjerString;

import java.util.Scanner;

public class T3_String1_StringBuffer {

    public static void main(String[] args) {
        
      /**
       * Ejercicio 1. Crea un programa en Java que solicite al usuario la introducción de una cadena de caracteres y
         devuelva esta cadena invertida. Haz dos versiones, una con String y otra con StringBuffer
        */

      Scanner sc = new Scanner(System.in);
      
      //Para crear un StringBuffer
      StringBuffer cadena = new StringBuffer();

      System.out.println("Introduce la cadena de carácteres: ");
      cadena.append(sc.nextLine()); //append añade al StringBuffer un valor al final

      //Metodo para invertir la cadena
      cadena.reverse();

      System.out.println(cadena);

      sc.close();

      
    }
    
}
