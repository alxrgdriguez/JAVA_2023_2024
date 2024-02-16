package Tema5Prog.McBurger.dominio;

import Tema5Prog.McBurger.interfaces.Cocinable;

public class Patata extends Comida{

    private int estado;

    public Patata() {
        super("Patata", tipoIngredientes.comida);
        this.estado = 0;

    }


    /**
     * El precio de las patatas fritas es de 1,10 €.
     * El precio de la patata cocida es de 0,80 €.
     * El precio de la patata asada es de 0,90 €.
     * @return Devuelve el precio de las patatas fritas dependiendo de su estado (frita, cocida o asada)
     */
    @Override
    public double obtenerPrecio() {

        return switch (this.estado) {
            case 1 -> 1.10;
            case 2 -> 0.80;
            case 3 -> 0.90;
            default -> 0;
        };


    }

    public void freir() {
        this.estado = Cocinable.FRITA;
        this.nombre = "Patata.Frita";


    }

    public void asar() {
        this.estado = Cocinable.ASADA;
        this.nombre = "Patata.Asada";

    }

    public void cocer() {
        this.estado = Cocinable.COCIDA;
        this.nombre = "Patata.Cocida";

    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer(nombre + "................. ");
        sb.append(obtenerPrecio()).append("€");
        return sb.toString();
    }
}
