package EJERCICIOS_CONDICIONES_BUCLES_TEMA2;

import java.util.Scanner;

public class Ejercicio_16 {

    public static void main(String[] args) {
        
        /*16. Programa que lea por teclado una serie de números enteros hasta que introduzca el -1 y obtenga su
        media. Deberá mostrarla por pantalla. */

        Scanner sc = new Scanner(System.in);

        int suma = 0;
        int cantidadNumeros = 0;
        int numero;

        System.out.println("Introduce números enteros (introduce -1 para finalizar):\n ");

        System.out.print("Introduce un numero: ");
        numero = sc.nextInt();

        while (numero != -1) {
            suma = suma + numero;
            cantidadNumeros++;
            System.out.print("Introduce un numero: ");
            numero = sc.nextInt();
        }

        // Verificar si se ingresaron al menos algunos números antes de calcular la media
        if (cantidadNumeros > 0) {
            double media = (double) suma / cantidadNumeros;
            System.out.println("La media de los números es: " + media);
        } else {
            System.out.println("No se ingresaron números para calcular la media.");
        }

        sc.close();
    }
}

    