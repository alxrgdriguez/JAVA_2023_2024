package Tema4Prog.EjerciciosT4_POO.T4_Ejercicio6;

public class TestSteamJuego {

    public static void main(String[] args) {

        SteamJuego juego1 = new SteamJuego("Counter Strike","Disparos",12533.5,1560,0.0,700);
        SteamJuego juego2 = new SteamJuego("Phasmofobia","Terror",450.23,863,19.99,120);
        SteamJuego juego3 = new SteamJuego("Howards Legacy","Magia",2540.72,365,49.99,1000);

        System.out.println("--- ORDENACION DE PUESTOS MAS VENDIDOS ---");
        System.out.println("Howards Legacy --> " + juego3.getPuestosMasVendidos());
        System.out.println("Counter Strike --> " + juego1.getPuestosMasVendidos());
        System.out.println("Phasmofobia --> " + juego2.getPuestosMasVendidos());


        juego1.jugadoresDia(3254);
        juego2.jugadoresDia(225);
        juego3.jugadoresDia(867);

        System.out.println(" \n------ MEDIA DE JUGADORES ----- ");
        System.out.println("Media jugadores Counter Strike -->  " + juego1.getMediaJugadoresDiarios());
        System.out.println("Media jugadores Phasmofobia  -->  " + juego2.getMediaJugadoresDiarios());
        System.out.println("Media jugadores Howards Legacy  -->  " + juego3.getMediaJugadoresDiarios());


    }
}
