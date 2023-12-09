package Tema1Prog.T1_Ejercicios;

import java.util.Scanner;

public class T1_Ejercicio1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // Ejercicio 1. Escribir un programa que pregunte al usuario su nombre, y luego lo salude. 

        String nombre;

        System.out.println("Escriba su nombre: ");
        nombre = sc.nextLine();

        System.out.println("Hola " + nombre + " bienvenido a la programación Java");

        sc.close();

    }

}
