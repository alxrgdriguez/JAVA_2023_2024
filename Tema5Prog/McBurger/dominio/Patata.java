package Tema5Prog.McBurger.dominio;


import interfaces.Cocinable;

import static Tema5Prog.McBurger.interfaces.Cocinable.CRUDA;

public class Patata extends Comida {

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


}
