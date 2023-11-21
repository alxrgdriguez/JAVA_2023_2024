package bucles;
import java.util.Scanner;

public class Menu2 {

    public static void main(String[] args) {


        int opcion; // Opción del menú elegida por el usuario
        Scanner sc = new Scanner(System.in);

        // Repetimos el proceso hasta que el usuario seleccione la opción de salir
        do {
            // Mostramos el menú
            System.out.println("\n------ MENU -------");
            System.out.println("1) Añadir Usuario");
            System.out.println("2) Eliminar  Usuario");
            System.out.println("3) Borrar Todo");
            System.out.println("4) Salir");

            // Leemos la opción elegida por el usuario y la ejecutamos
            System.out.println("\nIntroduce una opción: ");
            opcion = sc.nextInt();

            // Validamos la opción elegida
            if (opcion < 1 || opcion > 4) {
                System.out.println("");
                System.out.println("Error al elegir la opción");
                break;
                
            }

            // Ejecutamos la opción elegida
            switch (opcion) {
                case 1:
                    System.out.println("\nSe ha añadido el usuario correctamente");
                    break;
                case 2:
                    System.out.println("\nSe ha eliminado el usuario correctamente");
                    break;
                case 3:
                    System.out.println("\nSe ha eliminado TODO");
                    break;

                default:

                    System.out.println("\nAdios :D");
                    break;
            }

        } while (opcion != 4);

    }

}