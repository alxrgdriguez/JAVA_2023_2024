package EjerciciosRepaso_UT2;

import java.util.Scanner;

public class Ejercicio7 {

    /**
     * Ejercicio7
     * Piedra-papel-tijera. Realiza un programa que genere una tirada simulando piedra-papel-tijera. Haz otra
       tirada para otro jugador y di quién de los dos gana. Mejora el programa para que indique el número de
       partidas a jugar y al final indica cuántas partidas ha ganado cada uno
     */

    public static String tirada(){

        int aleatorio = (int) (Math.random()*3+1);

        if (aleatorio == 1){

            return "Piedra";

        }else if (aleatorio == 2){

            return "Papel";

        }else {

            return "Tijera";
        }
    
    }

    /**
     * Este método dice quien gana, si jugador1 o jugador2 dependiendo lo que saque
     * @param j1 Tirada jugador1
     * @param j2 Tirada jugador2
     * @return Devuelve el ganador del juego
     */
    public static String ganador(String j1, String j2){

        String ganador = "";


        switch (j1) {
            case "Papel":
            
                switch (j2) {
                    case "Tijera":

                        ganador = "Jugador 2";
                        
                        break;
                    case "Piedra":

                        ganador = "Jugador 1";
                        break;

                    case "Papel":

                        ganador = "Empate";
                        break;
                }
                break;

            case "Piedra":

                  switch (j2) {
                    case "Tijera":

                        ganador = "Jugador 1";
                        
                        break;
                    case "Piedra":

                        ganador = "Empate";
                        break;

                    case "Papel":

                        ganador = "Jugador 2";
                        break;
                }
                
                break;
        
            case "Tijera":

                  switch (j2) {
                    case "Tijera":

                        ganador = "Empate";
                        
                        break;
                    case "Piedra":

                        ganador = "Jugador 2";
                        break;

                    case "Papel":

                        ganador = "Jugador 1";
                        break;
                }
                break;
        }

        return ganador;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero= 0;
        int contadorEmpate = 0;
        int contadorJ1 = 0;
        int contadorJ2 = 0;

        try {
            System.out.print("Escriba el numero de partidas que desea jugar: ");
            numero = Integer.parseInt(sc.nextLine());

            for (int i = 0; i < numero; i++){

                  
                String j1 = tirada();
                String j2 = tirada();
                
                if (ganador(j1, j2).equals("Jugador 1")){

                    contadorJ1++;

                }else if (ganador(j1, j2).equals("Jugador 2")){

                    contadorJ2++;

                }else{

                    contadorEmpate++;
                }

                System.out.println();
                System.out.println("J1: " + j1 + " J2: " + j2);
                System.out.println(ganador(j1, j2));


            }
          
        } catch (Exception e) {
            System.out.println("Debes introducir un NUMERO de partidas");
        }
        
        System.out.println("El Jugador 1 ha ganadado un total de " + contadorJ1 + " partidas");
        System.out.println("El Jugador 2 ha ganadado un total de " + contadorJ2 + " partidas");
        System.out.println("Hubo " + contadorEmpate + " empate(s)");

    }
    
}
