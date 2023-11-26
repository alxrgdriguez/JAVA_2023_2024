package EJERCICIOS_CONDICIONES_BUCLES_TEMA2;

import java.util.Scanner;

public class Ejercicio_17 {

    public static void main(String[] args) {
        
        /*17. Programa que lea un entero positivo introducido por el usuario y que muestre por pantalla todos sus
        divisores */

        // Crear un objeto Scanner para la entrada del usuario
        Scanner sc = new Scanner(System.in);

        //Declaramos la variable entera

        int numero;

        //Pedir al usuario que nos ingrese el numero para guardarlo en la variable numero

        System.out.print("Introduce un numero: ");
        numero = sc.nextInt();

         // Verificar si el número ingresado es positivo

         if (numero <= 0){

            System.out.println("Debes ingresar un numero positivo");

         }else{

            // Mostrar mensaje de inicio
            System.out.println("Los divisores de " + numero + " son:");

            for (int i = 1; i<= numero; i++){

                if (numero % i == 0){

                    System.out.println(i);
                }
            }

         }



        sc.close();
    }
    
}
