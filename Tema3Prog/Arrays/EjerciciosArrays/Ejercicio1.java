package Tema3Prog.Arrays.EjerciciosArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        
    /**
     * Ejercicio 1
        Crear un vector de 5 elementos de cadenas de caracteres, inicializa el vector con datos
        leídos por el teclado. Copia los elementos del vector en otro vector, pero en orden inverso, y
        muéstralo por la pantalla

        Pasos a seguir:

        Declarar un array de 5 strings
        Declarar otro igual
        Llenar el primero con String leido de teclado --> for
        Copiar en orden inverso esos valores al otro array --> for
        Pintar el segundo array
     */

    Scanner sc = new Scanner(System.in);

    String cadena[] = new String[5];

    String Inverso[] = new String[5];

     for (int i = 0; i < cadena.length; i++){

            System.out.println("Introduce una palabras ");
            cadena[i] = sc.nextLine();     

     }

    for (int i = cadena.length-1; i>= 0; i--){

        Inverso[cadena.length -1 -i] = cadena[i];

    }

    System.out.println("Inverso: " + Arrays.toString(Inverso));
    System.out.println();
    System.out.print("Normal: " + Arrays.toString(cadena));
    System.out.println();

    sc.close();

    }
    
}
