package Examen1ErTrimestre;

import java.util.Scanner;

public class Ejercicio2 {

    /**
     * Función que genera un número aleatorio entre un valor mínimo y máximo
     * @param min
     * @param max
     * @return número aleatorio entre min y max, incluidos
     */
    public static int generarNumero(int min, int max)  {
        return  (int) ((Math.random() * (max - min + 1) + min)) ;
    }


    public static void main(String[] args) {
        
        /**
         * Ejercicio 2. Craps. Es un juego de dados muy facil, y consiste en arrojar la suma de 2 dados,
        y su suma es 7 u 11 ganas la partida. En cambio, si sacas un 2, 3 o 12 pierdes. Con cualquier
        otro numero que saques, debes guardar ese número y tirar los dados repetidamente hasta
        volver a sacar ese dado (ganas) o sacar el 7 (pierdes). Realiza el juego para dos jugadores
        simulando las tiradas de forma aleatoria y que jueguen 10 partidas, indica cuántas partidas
        gana jugador1 y cuántas jugador2. Ahora simula 1000 partidas e indica las partidas que
        gana cada uno.
         */

        Scanner sc = new Scanner(System.in);
        
        boolean ganado = false;
        int nTurnos = 10;
        int sumarTiradas = 0;
        int contadorJ1 = 0;
        int contadorJ2 = 0;
        int tiradaJ1 = 0;
        int tiradaJ2 = 0;

    


        for (int i = 0; i < nTurnos; i++) {
            
            do {

            tiradaJ1 = generarNumero(1, 6);
            tiradaJ2 = generarNumero(1, 6);

            sumarTiradas = (tiradaJ1 + tiradaJ2);

            System.out.println(sumarTiradas);
                
            
            if (tiradaJ1 == 7 || tiradaJ1 == 11) {
            
            contadorJ1++;
            System.out.println("Jugador 1 ha ganado 1 punto");
            System.out.println("Ahora Jugador 1 dispone de " + contadorJ1 + " puntos");

            }else if(tiradaJ2 == 7 || tiradaJ2 == 11){

                contadorJ2++;
                System.out.println("Jugador 2 ha ganado 1 punto");
                System.out.println("Ahora Jugador 2 dispone de " + contadorJ2 + " puntos");

            }else if(tiradaJ1 == 2 || tiradaJ1 == 3 || tiradaJ1 == 12){

                System.out.println("Ahora Jugador 1 dispone de " + contadorJ1 + " puntos");

            }else if(tiradaJ2 == 2 || tiradaJ2 == 3 || tiradaJ2 == 12){

                System.out.println("Ahora Jugador 2 dispone de " + contadorJ2 + " puntos");
            }

            } while (!ganado);
        
        
        }     
        
        System.out.println("La suma total de puntos de Jugador 1 ha sido de: " + contadorJ1);
        System.out.println("La suma total de puntos de Jugador 2 ha sido de: " + contadorJ2);

    }

}
    

