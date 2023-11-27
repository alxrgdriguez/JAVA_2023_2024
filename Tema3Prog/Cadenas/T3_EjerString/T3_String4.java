package Tema3Prog.Cadenas.T3_EjerString;

import java.util.Scanner;

public class T3_String4 {

    public static void main(String[] args) {
        
        /**
         * Ejercicio 4. Crea un programa en Java que solicite al usuario dos cadenas de caracteres y que devuelva la primera
           cadena, pero transformando en mayúsculas la parte que coincide con la segunda cadena introducida.
           Por ejemplo, si se introducen las cadenas “Esta es mi amiga Ana” y “amiga” devolverá “Esta es mi
           AMIGA Ana”.
         */

      Scanner sc = new Scanner(System.in);

      String frase = "";
      String buscar = "";

      System.out.println("Introduce una frase: ");
      frase = sc.nextLine();

      System.out.println("Introduce la palabra a buscar: ");
      buscar = sc.nextLine();

      //Cortamos una cadena según el parámetro del split y el resultado se guarda en un array de String
      String[] fraseCortada = frase.split(" ");

      for(int i = 0; i < fraseCortada.length; i++){

          if(fraseCortada[i].equals(buscar)){

            //Convertir a mayusculas y lo guarda en la misma posición
            fraseCortada[i] = fraseCortada[i].toUpperCase();    
          
          }
      }

      String cadenaTemp = "";

      for(int i  = 0; i < fraseCortada.length; i++){

          //Añadir un espacio entre cada palabra dentro de la cadena
          cadenaTemp += fraseCortada[i] + " ";
      }

      System.out.println(cadenaTemp);

      sc.close();
    }
    
}
