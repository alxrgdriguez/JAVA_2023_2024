package Tema5Prog.Practica_Objetos2.equipo_ciclistas;

abstract class Ciclista {

    //Propiedades
    protected int identificador;

    protected String nombre;

    protected double tiempoAcumulado;

    //Constructor

    public Ciclista(int identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.tiempoAcumulado = 0;
    }
}
