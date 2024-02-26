package PracticaClase_UT2;

import java.util.Scanner;


public class Ejercicio2 {

    public static int tiradas() {

        return (int) Math.ceil(Math.random() * 10);

    }

    

    public static void main(String[] args) {
        
        /*Cubitus y Humerus 1
        Marcus Cubitus y Julius Humerus son dos legionarios que se entretienen en sus ratos
        libres jugando a juegos de dados, el pasatiempo favorito de los antiguos romanos. Un
        juego que pudieron haber jugado estos amigos consiste en tirar cada jugador cinco dados.
        La puntuación es la suma total de puntos, sin contar los valores que coincidan con el
        mínimo o el máximo obtenido. El jugador que saca más puntos gana la partida. Escriba un
        programa que simule varias partidas seguidas de este juego de dados. */

        Scanner sc = new Scanner(System.in);


        int totalTurnos;
        int tiradaJ1_1 = 0, tiradaJ1_2 = 0, tiradaJ1_3 = 0, tiradaJ1_4 = 0, tiradaJ1_5;
        int tiradaJ2_1 = 0, tiradaJ2_2 = 0, tiradaJ2_3 = 0, tiradaJ2_4 = 0, tiradaJ2_5;
        int totalJ1 = 0;
        int totalJ2 = 0;

        System.out.print("Introduce la cantidad de turnos que desean jugar: ");
        totalTurnos = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= totalTurnos; i++){

            System.out.println("--------");
            System.out.println("Turnos " + i );
            System.out.println("--------");
            System.out.println();

            
            tiradaJ1_1 = tiradas();
            tiradaJ1_2 = tiradas();
            tiradaJ1_3 = tiradas();
            tiradaJ1_4 = tiradas();
            tiradaJ1_5 = tiradas();

            System.out.println("Cubitus " + "| " + tiradaJ1_1 + " | " + "| " + tiradaJ1_2 + " | " + "| " + tiradaJ1_3 + " | " + "| " + tiradaJ1_4 + " | " + "| " + tiradaJ1_5 + " | " );

            tiradaJ2_1 = tiradas();
            tiradaJ2_2 = tiradas();
            tiradaJ2_3 = tiradas();
            tiradaJ2_4 = tiradas();
            tiradaJ2_5 = tiradas();

            System.out.println("Humerus " + "| " + tiradaJ2_1 + " | " + "| " + tiradaJ2_2 + " | " + "| " + tiradaJ2_3 + " | " + "| " + tiradaJ2_4 + " | " + "| " + tiradaJ2_5 + " | " );


            if (tiradaJ1_1 != tiradaJ2_1 || tiradaJ1_2 != tiradaJ2_2 || tiradaJ1_3 != tiradaJ2_3 || tiradaJ1_4 != tiradaJ2_4 || tiradaJ1_5 != tiradaJ2_5  ){

                totalJ1 = (totalJ1 + tiradaJ1_1 + tiradaJ1_2 + tiradaJ1_3 + tiradaJ1_4 + tiradaJ1_5);

            }else {

                
                totalJ2 = (totalJ2 + tiradaJ2_1 + tiradaJ2_2 + tiradaJ2_3 + tiradaJ2_4 + tiradaJ2_5);
            }


            System.out.println("");
            System.out.println("Total de Puntos Cubitus: " + totalJ1);
            System.out.println("Total de Puntos Humerus: " + totalJ2);
        }





    }
    
}
