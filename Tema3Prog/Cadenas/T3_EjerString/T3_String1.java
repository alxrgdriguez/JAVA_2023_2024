package Tema3Prog.Cadenas.T3_EjerString;
import java.util.Scanner;

class T3_String1{

    public static void main(String[] args) {
        
        /**
         * Ejercicio 1. Crea un programa en Java que solicite al usuario la introducción de una cadena de caracteres y
           devuelva esta cadena invertida. Haz dos versiones, una con String y otra con StringBuffer
         */

        //Declaramos nuestro Scanner
        Scanner sc = new Scanner(System.in);

        //Declaramos nuestra variable tipo cadena
        String cadena = "";
        String temp = "";
        //Pedimos al usuario que nos introduzca la cadena pedida por teclado
        System.out.println("Introduce una cadena de caracteres: ");
        cadena = sc.nextLine();

      //Recorremos la cadena de la ultima posición hacia la primera para ir añadiendo a la variable temp los carácteres uno por uno
        for(int i = cadena.length()-1; i >= 0; i--){
          temp += cadena.charAt(i);
        }

        System.out.println(temp);



        //Chuletas

        /*int numeros = 234;

        //Convertir un entero a cadena
        String numerosCadena = String.valueOf(numeros);

        //....

        //Convertir una cadena a entero
        numeros = Integer.parseInt(numerosCadena);*/

        sc.close();
    }
}