package Tema3Prog.Cadenas.T3_EjerString;

import java.util.Scanner;

public class T3_String2 {

    public static void main(String[] args) {
        
        /**
         * Ejercicio 2. . Crea un programa que reciba una cadena de caracteres y la devuelva invertida con efecto espejo, este
           es, se concatena a la palabra original su inversa, compartiendo la última letra, que hará de espejo, por
           lo que la palabra obtenida se lee igual hacia adelante que hacia atrás. Por ejemplo, al introducir
           “teclado” devolverá “tecladodalcet” y al introducir “hola” devolverá “holaloh”. Haz dos versiones, una
           con String y otra con StringBuffer.
         */

         //Declaramos nuestro Scanner
        Scanner sc = new Scanner(System.in);

        //Declaramos nuestra variable tipo cadena
        String cadena = "";
        
        //Pedimos al usuario que nos introduzca la cadena pedida por teclado
        System.out.println("Introduce una cadena de caracteres: ");
        cadena = sc.nextLine();
    
      //Recorremos la cadena de la ultima posición hacia la primera para ir añadiendo a la variable temp los carácteres uno por uno
        for(int i = cadena.length()-2; i >= 0; i--){
          cadena += cadena.charAt(i);
        }

        System.out.println(cadena);

        sc.close();


    }
    
}
