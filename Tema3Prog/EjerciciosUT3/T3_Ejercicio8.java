package Tema3Prog.EjerciciosUT3;

import java.util.Arrays;
import java.util.Scanner;

class T3_Ejercicio8{

     /**
         *Ejercicio8. Genera aleatoriamente una tabla de 10 elementos numéricos enteros, guardalos en una array. Luego pide por
          teclado una posición (entre 0 y 9). Eliminar el elemento situado en la posición dada sin dejar huecos.
         */

         public static int numaleatorio(int min, int max){

            return (int) (Math.random() * (max - min + 1) + min);
    
        }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];
        int posicion = 0;

        for(int i = 0; i < numeros.length; i++){

            numeros[i] = numaleatorio(1, 50);

        }

        System.out.println(Arrays.toString(numeros));


        do {
            try {
                System.out.println("Introduce una posición entre (0-9) para eliminar una posición del array: ");
                posicion = Integer.parseInt(sc.nextLine());

                if (posicion < 0 || posicion > 9) {
                    System.out.println("La posición debe estar entre 0 y 9. Intenta de nuevo.");
                }

                if (posicion >= 0 && posicion < numeros.length) {
                    for (int i = posicion; i < numeros.length - 1; i++) {
                        numeros[i] = numeros[i + 1];
                    }
                }

                numeros[numeros.length - 1] = 0; // O el valor que deseamos asignar al último elemento.
                System.out.println("Elemento en la posición " + posicion + " eliminado.");

                 // Mostrar el array después de la eliminación.
                System.out.println(Arrays.toString(numeros));

            } catch (NumberFormatException e) {
                System.out.println("Debes introducir un número válido");
            }
        } while (posicion < 0 || posicion > 9);

        sc.close();

    }

}