package Tema5Prog.Practica_Objetos2.juego_bladeofdarkness_2;

public class TestJuego {

    String clase = this.getClass().getName();

    public static void main(String[] args) {


        //Creamos nuestro Jugador
        Jugador j1 = new Jugador("Nazgul");

        //Creamos nuestra partida
        Partida partida = new Partida(j1);

        //Iniciamos la partida
        partida.iniciarPartida();

        //j1.setSalud(10000000);

        for (int i = 1; i <= 30 ; i++){

            if(j1.getSalud() <= 0){

            }
            System.out.println("\nTurno del jugador");
            //Turno jugador
            partida.turnoJugador();

            System.out.println("\nTurno del enemigo");
            //Turno enemigos
            partida.turnoEnemigos();
        }

    }
}
