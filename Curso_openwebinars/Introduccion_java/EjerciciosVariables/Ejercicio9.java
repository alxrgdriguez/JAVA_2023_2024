package Curso_openwebinars.Introduccion_java.EjerciciosVariables;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        
        /**
         * Escribe un programa en Java que intercambie el valor de dos variables
         */

        Scanner sc = new Scanner(System.in);

        int A, B, temporal;

        System.out.println("Introduce el valor de A: ");
        A = Integer.parseInt(sc.nextLine());

        System.out.println("Introduce el valor de B: ");
        B = Integer.parseInt(sc.nextLine());

        System.out.println("Valor inciales: A = " + A + " B = " + B);

        temporal = B;
        B = A;
        A = temporal;

        System.out.println("Valor intercambiados: A = " + A + " B = " + B);

        sc.close();

    }
    
}
