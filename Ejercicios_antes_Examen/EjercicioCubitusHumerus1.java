package Ejercicios_antes_Examen;

import java.util.Scanner;

/**
 * EjercicioCubitusHumerus1
 */
public class EjercicioCubitusHumerus1 {

    public static int numaleatorio(int min, int max){

        return (int) (Math.random() * (max - min + 1) + min);

    }
    public static void main(String[] args) {
        
        /**
         * Cubitus y Humerus 1
           Marcus Cubitus y Julius Humerus son dos legionarios que se entretienen en sus ratos
           libres jugando a juegos de dados, el pasatiempo favorito de los antiguos romanos. Un
           juego que pudieron haber jugado estos amigos consiste en tirar cada jugador cinco dados.
           La puntuación es la suma total de puntos, sin contar los valores que coincidan con el
           mínimo o el máximo obtenido. El jugador que saca más puntos gana la partida. Escriba un
           programa que simule varias partidas seguidas de este juego de dados.
        */

        Scanner sc = new Scanner(System.in);

        int numTurnos = 0;
        int tiradaJ1_1 = 0, tiradaJ1_2 = 0, tiradaJ1_3 = 0, tiradaJ1_4 = 0, tiradaJ1_5 = 0;
        int tiradaJ2_1 = 0, tiradaJ2_2 = 0, tiradaJ2_3 = 0, tiradaJ2_4 = 0, tiradaJ2_5 = 0;

        System.out.println("Introduce el numero de turnos que deseas jugar: ");
        numTurnos = Integer.parseInt(sc.nextLine());


        for (int i = 1; i < numTurnos; i++){

            System.out.println("\n--------");
            System.out.println("Turno " + i );
            System.out.println("--------");
            System.out.println();

            //Tiradas del jugador 1 Cubitus

            tiradaJ1_1 = numaleatorio(1, 6);
            tiradaJ1_2 = numaleatorio(1, 6);
            tiradaJ1_3 = numaleatorio(1, 6);
            tiradaJ1_4 = numaleatorio(1, 6);
            tiradaJ1_5 = numaleatorio(1, 6);
            System.out.println("Tiradas Cubitus " + " | " + tiradaJ1_1 + " | " + tiradaJ1_2 + " | " + tiradaJ1_3 +  " | " + tiradaJ1_4 + " | "  + tiradaJ1_5 + " |");
        
            //Tiradas del jugador 2 Humerus

            tiradaJ2_1 = numaleatorio(1, 6);
            tiradaJ2_2 = numaleatorio(1, 6);
            tiradaJ2_3 = numaleatorio(1, 6);
            tiradaJ2_4 = numaleatorio(1, 6);
            tiradaJ2_5 = numaleatorio(1, 6);
            System.out.println("Tiradas Humerus " + " | " + tiradaJ2_1 + " | " + tiradaJ2_2 + " | " + tiradaJ2_3 +  " | " + tiradaJ2_4 + " | "  + tiradaJ2_5 + " |");
       
        }
    
    }

}