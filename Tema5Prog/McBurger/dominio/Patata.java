package Tema5Prog.McBurger.dominio;

import Tema5Prog.McBurger.interfaces.Cocinable;

public class Patata extends Comida implements Cocinable {

    //Propiedades

    private int estado;

    //Constructor
    public Patata(){
        super();
        this.estado = CRUDA;
        this.setNombre("Patata.cruda");
    }

    //Metodos

    @Override
    public double obtenerPrecio() {

        double precio = 0;

        switch (this.estado){

            case FRITA:
                precio = 1.10;
                break;

            case COCIDA:
                precio = 0.80;
                break;

            case ASADA:
                precio = 0.90;
                break;
        }
        return precio;
    }

    @Override
    public void freir() {
        this.estado = FRITA;
        this.setNombre("Patata.frita");

    }

    @Override
    public void cocer() {
        this.estado = COCIDA;
        this.setNombre("Patata.cruda");
    }

    @Override
    public void asar() {
        this.estado = ASADA;
        this.setNombre("Patata.asada");
    }

    @Override
    public java.lang.String toString() {
        return super.toString();
    }
}
