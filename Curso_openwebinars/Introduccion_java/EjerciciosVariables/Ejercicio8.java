package Curso_openwebinars.Introduccion_java.EjerciciosVariables;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {
        
        /**
         * Escribe un programa en Java que calcule la media de 3 números que se hayan 
         * leído desde el teclado y la muestre por consola.
         */

        Scanner sc = new Scanner(System.in);

        int num1 = 0; //int == Integer
        int num2 = 0;
        int num3 = 0;

        System.out.println("Introduce el primer numero: ");
        num1 = Integer.parseInt(sc.nextLine());

        System.out.println("Introduce el segundo numero: ");
        num2 = Integer.parseInt(sc.nextLine());

        System.out.println("Introduce el tercer numero: ");
        num3 = Integer.parseInt(sc.nextLine());

        double media = (num1 + num2 + num3) / 3;

        System.out.println("La media de " + num1 + " " + num2 + " y " + num3 + " es: " + media);

        sc.close();

    }
    
}
