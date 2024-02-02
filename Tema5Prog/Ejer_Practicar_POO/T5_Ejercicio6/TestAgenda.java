package Tema5Prog.Ejer_Practicar_POO.T5_Ejercicio6;

import java.util.Scanner;

public class TestAgenda {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        do {

                System.out.println("AGENDA TELEFÓNICA");
                System.out.println(" --------------------- ");
                System.out.println("1. Añadir un contacto");
                System.out.println("2. Listar todos los contactos");
                System.out.println("3. Eliminar un contacto");
                System.out.println("4. Estado de la agenda");
                System.out.println("5. Salir");
                System.out.println(" --------------------- ");
                System.out.print("Elige una opcion: ");
            try {
                opcion = Integer.parseInt(sc.nextLine());

            }catch (Exception e) {
                System.out.println("Error al introducir la opcion, vuelva a ejecutar la Agenda");
                System.exit(1);
            }

            switch (opcion){

                case 1:

                    break;


                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                case 5:

                    System.out.println("Gracias por usar la Agenda, vuelva pronto");

                    break;


                default:
                    System.out.println("Opcion no valida!");



            }




        }while (opcion != 5);





    }
}
