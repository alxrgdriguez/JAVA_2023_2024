package Tema4Prog.Practica_Objetos1.juego_Ahorcado;

import java.util.Scanner;

public class TestAhorcado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Ahorcado a1 = new Ahorcado();
        int opcion = 0;


        System.out.println("  --- LETRAS AHORCADO --- ");
        System.out.println("La palabra tiene: " + a1.getPalabraAdivinar().length() + " letras\n");

        do{
            System.out.println("------- AHORCADO -------");
            System.out.println("Opcion 1: probarLetra");
            System.out.println("Opcion 2: probarPalabra");
            System.out.println("Opcion 3: Salir");
            System.out.print("\nElige una opcion: ");
            try {
                opcion = Integer.parseInt(sc.nextLine());

            }catch (Exception e){

                System.out.println("Ha ocurrido un error, vuelva a inciar el juego!");
                opcion=0;
                break;
            }


            switch (opcion){

                case 1:
                    char letra = ' ';
                    System.out.print("\nIntroduce una letra: ");
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
                    String palabra = "";
                    System.out.print("\nIntroduce una palabra: ");
                    palabra = sc.nextLine();

                    if (a1.probarPalabra(palabra) == true){

                        System.out.println("ENHORABUENA!!! HAS ACERTADO LA PALABRA :D");
                        System.exit(0);
                    }else {

                        System.out.println("HAS PERDIDO!! LA PALABRA ERA --> " + a1.getPalabraAdivinar());
                        System.exit(0);
                    }
                    break;

                case 3:

                    System.out.println("Gracias por jugar al juego del Ahorcado, vuelva pronto!");
                    break;

                default:

                    System.out.println("Opcion no valida!!\n");
                    break;
            }

            if(a1.getNumFallos() == 7){
                System.out.println("Has superado el limite de intentos, gracias por jugar!");
                break;
            }

        }while (opcion != 3);

    }
}
