package EJERCICIOS_CONDICIONES_BUCLES_TEMA2;

import java.util.Scanner;

public class Ejercicio_14 {

    public static void main(String[] args) {
        
        /*14. Programa que lea dos números positivos e imprima por pantalla todos los números pares que estén entre
        los dos números dados. También debe indicar cuántos números pares hay en ese intervalo. */

       // Declaramos las variables enteras
       int numero1, numero2;
       int contadorPares = 0;

       // // Crear un objeto Scanner para la entrada del usuario
       Scanner sc = new Scanner(System.in);

       System.out.print("Ingrese el primer número positivo: ");
       numero1 = sc.nextInt();

       System.out.print("Ingrese el segundo número positivo: ");
       numero2 = sc.nextInt();

       // Verificar si los números ingresados son positivos
       while (numero1 <= 0 || numero2 <= 0) {
           System.out.println("\nPor favor, ingrese números positivos.\n");

           // Solicitar al usuario que ingrese los números nuevamente
           System.out.print("Ingrese el primer número positivo: ");
           numero1 = sc.nextInt();

           System.out.print("Ingrese el segundo número positivo: ");
           numero2 = sc.nextInt();
       }

       // Imprimir los números pares en el rango y contar la cantidad
       System.out.println("Números pares en el rango:");
       for (int i = numero1; i <= numero2; i++) {
           if (i % 2 == 0) {
               System.out.println(i);
               contadorPares++;
           }
       }

       // Imprimir la cantidad total de números pares
       System.out.println("El total de numeros pares en ese rango es de: " + contadorPares);

       sc.close();
   }
       

}
    

