package Ejercicios_antes_Examen;

import java.util.Scanner;

public class EjercicioMenu {

    public static void main(String[] args) {
        
        /**
         *
        Menú
        Realiza un programa que pida un número por teclado. Luego muestra un menú con las
        siguientes opciones:
        1. Muestra la suma de cada uno de sus dígitos
        2. Que diga si es primo o no
        3. La longitud de una circunferencia cuyo radio fuera ese número
        4. Salir
        Para cada una de las opciones deberás llamar a una función que calcule lo que se pide y
        devuelva el resultado.
         */

        Scanner sc = new Scanner(System.in);

        int opcion = 0;

        do {

            System.out.println("\n----- MENU -----");
            System.out.println("1. Muestra la suma de cada uno de sus dígitos");
            System.out.println("2. Que diga si es primo o no");
            System.out.println("3. La longitud de una circunferencia cuyo radio fuera ese número");
            System.out.println("4. Salir");
            System.out.println("----------------");
            System.out.print("Introduce una opcion: ");

            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("La opcion debe ser un numero");
            }
            
        } while (opcion != 4);

        switch (opcion) {
            case 1:
                
                break;

            case 2:
                
                break;

            case 3:
                
                break;

            case 4:
                
                System.out.println("Adios");

                break;
        
            default:

                System.out.println("Opcion no valida");
                break;
        }


    }
    
}
