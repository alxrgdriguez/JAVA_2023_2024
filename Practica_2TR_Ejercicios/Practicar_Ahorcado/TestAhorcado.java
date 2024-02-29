package Practica_2TR_Ejercicios.Practicar_Ahorcado;

import java.util.Scanner;

public class TestAhorcado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Ahorcado juego = new Ahorcado();
        int opcion = 0;

        //Mostramos cuantas palabras tiene nuestro ahorcado
        System.out.println("******* LETRAS QUE TIENE LA PALABRA *******");
        System.out.println("- La palabra elegida tiene " + juego.getPalabraAdivinar().length()  + " letras\n");
        System.out.println("- Palabra asiganada:  " + juego.getPalabraIntentada());

        do {
            System.out.println("\n/////////////////////////////////////////");
            System.out.println("            JUEGO AHORCADO  ");
            System.out.println("/////////////////////////////////////////");
            System.out.println("- 1.probarLetra");
            System.out.println("- 2.probarPalabra");
            System.out.println("- 3.Salir del juego");

            try {
                System.out.print("- Introduce una opcion para jugar (1 2 3): ");
                opcion = Integer.parseInt(sc.nextLine());



            }catch (Exception e){
                System.out.println("Has elegido una opción invalida");
                System.exit(1);
            }

            switch (opcion) {

                case 1:

                    char letra = ' ';
                    System.out.print("\nIntroduce una letra: ");
                    letra = sc.nextLine().charAt(0);
                    System.out.println("Letra introducida: " + letra);
                    if (juego.probarLetra(letra)){

                        System.out.println("La letra existe");
                    }else{

                        System.out.println("La letra no existe");
                    }

                    System.out.println(juego.getPalabraIntentada());
                    System.out.println("Nº Fallos --> " + juego.getNumFallos());
                    break;

                case 2:

                    String palabra = "";
                    System.out.print("\nIntroduce una palabra: ");
                    palabra = sc.nextLine();

                    if (juego.probarPalabra(palabra)){

                        System.out.println("ENHORABUENA!!! HAS ACERTADO LA PALABRA :D");
                        System.exit(0);
                    }else {

                        System.out.println("HAS PERDIDO!! LA PALABRA ERA --> " + juego.getPalabraAdivinar());
                        System.exit(0);
                    }

                    break;

                case 3:
                    System.out.println("Gracias por jugar, vuelva pronto :D");
                    System.exit(0);
                    break;

                default:

                    System.out.println("Opcion no valida, vuelva a intentarlo");
                    break;

            }



        }while (opcion != 3);



    }
}
