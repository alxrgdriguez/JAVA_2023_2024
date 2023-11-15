import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio5 {


    public static void main(String[] args) {
        
        /*Leer 10 números enteros y a continuación mostrar la media de los números introducidos, el mayor valor y el
        menor valor. Usar un array para almacenar los valores y sacar toda la información en una sola iteración del array.
        Si puedes mejóralo implementando una función para cada tarea (media, mayor, menor), pasando el array. */

            // Declaramos el array
        int[] numeros = new int[10];

        // Leemos los 10 números
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = Integer.parseInt(sc.nextLine());
        }

        // Inicializamos las variables
        int suma = 0;
        int mayor = numeros[0];
        int menor = numeros[0];

        // Recorremos el array
        for (int i = 0; i < numeros.length; i++) {

            //Hacemos la suma de los numeros del array
            suma += numeros[i];

            //Decimos cual es el numero mayor y el numero menor
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Calculamos la media
        double media = suma / numeros.length;

        // Mostramos los resultados
        System.out.println("La media es " + media);
        System.out.println("El mayor valor es " + mayor);
        System.out.println("El menor valor es " + menor);

        //Cerramos el Scanner
        sc.close();
    }
}


 