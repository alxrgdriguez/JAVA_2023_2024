package Tema5Prog.Practica_Objetos2.juego_bladeofdarkness_2;

import java.util.ArrayList;

import static java.lang.System.exit;

public class Partida {

    private Jugador jugador;
    private ArrayList<Monstruo> monstruos;

    public Partida(Jugador jugador) {
        this.jugador = jugador;
        this.monstruos = new ArrayList<>();

        this.monstruos.add(new Monstruo("KUM", Monstruo.ClaseM.TROLL, 80));
        this.monstruos.add(new Monstruo("ARREBATO", Monstruo.ClaseM.DEMONIO, 50));
        this.monstruos.add(new Monstruo("PILPIL", Monstruo.ClaseM.SKRALL, 90));
        this.monstruos.add(new Monstruo("ROÑIGLIL", Monstruo.ClaseM.TROLL, 20));
        this.monstruos.add(new Monstruo("SAGITER", Monstruo.ClaseM.GOBLIN, 68));
        this.monstruos.add(new Monstruo("MOGHETE", Monstruo.ClaseM.TROLL, 38));
        this.monstruos.add(new Monstruo("MANHUM", Monstruo.ClaseM.DEMONIO, 42));
        this.monstruos.add(new Monstruo("ZEMBLA", Monstruo.ClaseM.FANTASMA, 50));

        this.monstruos.add(new MonstruoFinalNivel("CATY", Monstruo.ClaseM.DEMONIO,200));
        this.monstruos.add(new MonstruoFinalNivel("TANWINO", Monstruo.ClaseM.SKRALL,170));
    }


    //Metodos


    public static int numaleatorio(int min, int max){

        return (int) (Math.random() * (max - min + 1) + min);

    }

    /**
     * Metodo para iniciar la partida
     */
    public void iniciarPartida() {

        for (int i = 1; i <= 100 ; i++){

            this.monstruos.add(new Monstruo("MONSTRUO " + i, Monstruo.ClaseM.DEMONIO,80));
        }

        this.jugador.equipar(new Arma("ESPADÓN CATALYNA", Arma.Tipo.ESPADA, 369, true));
    }

    /**
     * Metodo para turno del jugador
     */
    public void turnoJugador() {

        if (this.monstruos.size() == 0){

            System.out.println("Has ganado la partida");
            return; //Para salir del metodo
        }

        boolean luchado = false;
        do {
            int num = numaleatorio(0, this.monstruos.size() - 1);

            if (this.monstruos.get(num).getSalud() <= 0){

                monstruos.remove(num);
            }else{
                this.jugador.golpear(this.monstruos.get(num));
                System.out.println(this.jugador.getNombre() + " ha golpeado a " + this.monstruos.get(num).getNombre() + " y le ha echo " + this.jugador.getArmaDerecha().getPuntosD() + " daño");

                luchado=true;
            }


        }while (!luchado);

    }

    /**
     * Metodo para turno del monstruo
     */

    public void turnoEnemigos() {

        this.monstruos.get(0).golpear(this.jugador);
        System.out.println(this.monstruos.get(0).getNombre() + " ha golpeado a " + this.jugador.getNombre() + " y le ha echo " + this.monstruos.get(0).getPuntosD() + " daño");
        if (this.jugador.getSalud() <= 0){

            System.out.println("Has perdido la lucha");
            exit(0);
        }

    }

}
