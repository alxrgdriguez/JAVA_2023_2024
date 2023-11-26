package EJERCICIOS_CONDICIONES_BUCLES_TEMA2;

import java.util.Scanner;

public class Ejercicio_15 {

    public static void main(String[] args) {
        
        /*15. Programa que lea números hasta que le den el cero, y que diga cuál ha sido el mayor y cuál el menor de
        los números introducidos (sin tener en cuenta el cero).*/

            // Crear un objeto Scanner para la entrada del usuario
            Scanner sc  = new Scanner(System.in);

            int numero;

            // Solicitar al usuario que ingrese números hasta que se ingrese el cero
            System.out.println("Ingrese números (ingrese 0 para finalizar):\n");

            // Inicializar variables para el mayor y el menor
            System.out.print("Introduce un numero mas grande que 0: ");
            numero = sc.nextInt();

            int mayor = numero;
            int menor = numero;

            while (numero != 0) {
                // Decir cual es mayor y menor
                if (numero > mayor) {
                    mayor = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }

                // Solicitar el siguiente número
                System.out.print("Ingrese otro número (ingrese 0 para finalizar): ");
                numero = sc.nextInt();
            }

            // Mostrar el resultado después de ingresar el cero
            System.out.println("\nSe ingresó el cero. Fin del programa.\n");
            System.out.println("El mayor número ingresado fue: " + mayor);
            System.out.println("El menor número ingresado fue: " + menor);

            sc.close();
        }
    }