package Tema1Prog.T1_Ejercicios;

import java.util.Scanner;

public class T1_Ejercicio1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // Ejercicio 1. Escribir un programa que pregunte al usuario su name, y luego lo salude. 

        String name;

        System.out.println("Escriba su name: ");
        name = sc.nextLine();

        System.out.println("Hola " + name + " bienvenido a la programación Java");

        sc.close();


    }

}
