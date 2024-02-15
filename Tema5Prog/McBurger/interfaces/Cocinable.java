package Tema5Prog.McBurger.interfaces;

public interface Cocinable {

    //Propiedades Constantes

    final int CRUDA = 0;
    final int FRITA = 1;
    final int COCIDA = 2;
    final int ASADA = 3;

    //Metodos

    public int freir();
    public int cocer();
    public int asar();


    }


