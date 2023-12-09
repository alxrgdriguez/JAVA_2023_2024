package Ejercicios_antes_Examen;

import java.util.Scanner;

public class EjercicioCadenas {

    public static void main(String[] args) {
        
        /**
         * Implementa un programa que pida al usuario que introduzca una frase, y a
           continuación que introduzca dos cadenas. El programa debe mostrar por pantalla la frase
           introducida en primer lugar, en la que se hayan sustituido todas las apariciones de la
           primera cadena por la segunda cadena. Por ejemplo: si la frase introducida es “Quiero ir a
           vivir cerca del Guadalquivir”, y las cadenas introducidas a continuación son “ir” e “IRR”, al
           reemplazar la primera cadena por la segunda obtendríamos como resultado la
           frase“Quiero IRR a vivIRR cerca del GuadalquivIRR”
         */

        Scanner sc = new Scanner(System.in);

        String frase = "";
        String cadena1 = "";
        String cadena2 = "";


        System.out.print("Dime una frase: ");
        frase = sc.nextLine();

        System.out.print("Introduce la primera cadena: ");
        cadena1 = sc.nextLine();

        System.out.println("Introduce la segunda cadena: ");
        cadena2 = sc.nextLine();

        // Reemplazar todas las apariciones de la primera cadena por la segunda cadena
        String remplazada = frase.replace(cadena1, cadena2);

        System.out.println("\n--- CADENA SIN MODIFICAR ---");
        System.out.println(frase);

        System.out.println("\n--- CADENA REMPLAZADA ---");
        System.out.println(remplazada);

        sc.close();
    }
    
}
