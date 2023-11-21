package bucles;
import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        /*Ejercicio 9
        Realizar un ejemplo de menú, donde podemos escoger las distintas opciones (Opción A,
        Opción B, Salir) hasta que seleccionamos la opción de “Salir”. */

        int opcion; // Opción del menú elegida por el usuario
        Scanner sc = new Scanner(System.in);

        // Repetimos el proceso hasta que el usuario seleccione la opción de salir
        do {
            // Mostramos el menú
            System.out.println("\n------ MENU -------");
            System.out.println("1) Opción A");
            System.out.println("2) Opción B");
            System.out.println("3) Salir");

            // Leemos la opción elegida por el usuario y la ejecutamos
            System.out.println("Introduce una opción: ");
            opcion = sc.nextInt();

            // Validamos la opción elegida
            if (opcion < 1 || opcion > 3) {
                System.out.println("Error al elegir la opción");
                break;
                
            }

            // Ejecutamos la opción elegida
            switch (opcion) {
                case 1:
                    System.out.println("Has escogido la opción A");
                    break;
                case 2:
                    System.out.println("Has escogido la opción B");
                    break;
                case 3:
                    System.out.println("\nAdios :D");
                    break;
            }

        } while (opcion != 3);

    }

}