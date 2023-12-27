package Curso_openwebinars.Introduccion_java.EjerciciosVariables;

import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        
        /**
         * Escribe un programa que determine si un número es par o impar usando el operador ternario
         */

        Scanner sc = new Scanner(System.in);
        int numero = 0;

        System.out.println("Introduce el numero y te diré si es par o impar: ");
        numero = Integer.parseInt(sc.nextLine());

        String EsPar = (numero %2 == 0) ? "PAR" : "IMPAR";
        System.out.println(EsPar + "\n");

        if (numero %2 != 0) {
            
            System.out.println("Es IMPAR");

        }else{
            System.out.println("Es PAR");
        }

    }
    
}
