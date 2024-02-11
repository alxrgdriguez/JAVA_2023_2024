package Tema5Prog.Practica_Objetos2.equipo_ciclistas;

import java.util.Scanner;

public class TestCiclistas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("------ MENU ------");
            System.out.println("1. Imprimir datos del equipo");
            System.out.println("2. Añadir un ciclista al equipo (se van pidiendo sus datos)");
            System.out.println("3. Calcular el total de tiempos de los ciclistas del equipo ");
            System.out.println("4. Listar nombres de los ciclistas del equipo ");
            System.out.println("5. Buscar ciclista por identificador ");
            System.out.println("6. Salir \n");
            System.out.println("Introduce una opcion: ");

            try {
                opcion= Integer.parseInt(sc.nextLine());
            }catch (NumberFormatException e) {
                System.out.println("Ha ocurrido un error, vuelva a inciar el juego!");
                System.exit(1);
                opcion=0;
                break;
            }

            switch (opcion) {

                case 1:



                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;


                case 5:

                    String identificador = "";
                    System.out.println("Introduce el identificador del ciclista: ");
                    identificador = sc.nextLine();


                    break;


                case 6:

                    System.out.println("Gracias por usar el programa de ciclistas!");

                    break;


                default:
                    System.out.println("Opcion no valida!");
                    break;

            }

        }while (opcion!= 6);

        sc.close();
        System.exit(0);
    }

}