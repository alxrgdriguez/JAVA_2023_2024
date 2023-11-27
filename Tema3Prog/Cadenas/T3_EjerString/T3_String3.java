package Tema3Prog.Cadenas.T3_EjerString;

import java.util.Arrays;
import java.util.Scanner;

public class T3_String3 {

    public static void main(String[] args) {
        
        /**
         * Ejercicio 3. Diseña un programa en Java que solicite al usuario una cadena en la que buscará y otra que será la
           cadena buscada. El programa indicará cuántas veces aparece la segunda cadena en la primera.
         */

        Scanner sc = new Scanner(System.in);

        String buscar = "";
        String frase = "";
        int contador = 0;

        System.out.println("Introduce una frase: ");
        frase = sc.nextLine();


        System.out.println("Introduce la cadena que desees buscar en " + frase + ": ");
        buscar = sc.nextLine();

        //Cortamos la cadena segun le pasemos por parametro en el split y el resultado se guarda en un array de caracteres
        String[] fraseCortada = frase.split(" ");
 
        System.out.println(Arrays.toString(fraseCortada));

        for(int i = 0; i < fraseCortada.length; i++){

            if(fraseCortada[i].equals(buscar)){

                contador++;
            }
        }

        System.out.println("Hay " + contador + " veces la palabra " + buscar + " dentro de: " + frase);

        //Manera distinta para buscar una palabra dentro de una cadena usando el substring (ojo, que es mas lioso de entender pero es mas optimo porque busca tambien parte de palabra y letras)
        /*for(int i = 0; i < frase.length(); i++){
            
            if((i+buscar.length()) < frase.length())
            {
                if(buscar.equals(frase.substring(i, i+buscar.length()))){
                    contador++;
                }
            }
                
        }

        System.out.println("Hay " + contador + " veces la palabra " + buscar + " dentro de: " + frase);*/

        sc.close();
    }
    
}
