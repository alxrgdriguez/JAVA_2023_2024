package Tema5Prog.McBurger.interfaces;

public interface Cocinable {

    //Propiedades

    final static int CRUDA = 0;
    final static int FRITA = 1;
    final static int COCIDA = 2;
    final static int ASADA = 3;

    //Metodos
    public void freir();
    public void cocer();
    public void asar();
}
