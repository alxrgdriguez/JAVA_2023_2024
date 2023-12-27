package Curso_openwebinars.Introduccion_java.EjerciciosVariables;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        
        /**
         * Escribe un programa que lea dos números enteros por teclado, y realice las operaciones básicas de una 
         * calculadora con ellos: suma, resta, multiplicación, división y resto. 
         * Debe mostrar todos los resultados por consola.
         */

        Scanner sc = new Scanner(System.in);

        double num1 = 0;

        System.out.print("Introduce el numero 1: ");
        num1 = Double.parseDouble(sc.nextLine());

        double num2 = 0;

        System.out.print("Introduce el numero 2: ");
        num2 = Double.parseDouble(sc.nextLine());

        double suma = (num1 + num2);
        double resto = (num1 % num2);
        double resta = (num1 - num2);
        double multiplicacion = (num1 * num2);
        double division = (num1 / num2);

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La division es: " + division);
        System.out.println("Y el resto es: " + resto);

        sc.close();

    }
    
}
