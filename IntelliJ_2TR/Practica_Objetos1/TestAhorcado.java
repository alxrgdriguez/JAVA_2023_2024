package IntelliJ_2TR.Practica_Objetos1;

import java.util.Scanner;

public class TestAhorcado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ahorcado a1 = new Ahorcado();
        int opcion = 0;

        System.out.println("------- AHORCADO -------");
        System.out.println("La palabra tiene: " + a1.getPalabraAdivinar().length() + " carácteres");

        do{
            System.out.println(" ------ Menu ------");
            System.out.println("Opcion 1: probarLetra");
            System.out.println("Opcion 2: probarPalabra");
            System.out.println("Opcion 3: Salir");
            System.out.print("\nElige una opcion: ");
            opcion = Integer.parseInt(sc.nextLine());

            switch (opcion){

                case 1:
                    char letra = ' ';
                    System.out.println("Introduce una letra: ");
                    letra = sc.nextLine().charAt(0);
                    System.out.println("Letra introducida: " + letra);
                    if (a1.probarLetra(letra) == true){

                        System.out.println("La letra existe");
                    }else{

                        System.out.println("La letra no existe");
                    }

                    System.out.println(a1.getPalabraIntentada());
                    System.out.println("Nº Fallos --> " + a1.getNumFallos());
                    break;

                case 2:

                    break;

                case 3:

                    System.out.println("Adios");
                    break;

                default:

                    System.out.println("Opcion no valida!!");
                    break;
            }

            if(a1.getNumFallos() == 7){
                System.out.println("Has superado el limite de intentos");
                break;
            }

        }while (opcion != 3);

    }
}
