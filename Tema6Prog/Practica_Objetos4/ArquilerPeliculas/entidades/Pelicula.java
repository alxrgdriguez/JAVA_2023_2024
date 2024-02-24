package Tema6Prog.Practica_Objetos4.ArquilerPeliculas.entidades;

import Tema6Prog.Practica_Objetos4.ArquilerPeliculas.servicios.Multimedia;

public class Pelicula extends Multimedia {

    //Propiedades
    private int duracion;

    //Constructor
    public Pelicula(String titulo, boolean esPlus, double precio, int duracion) {
        super(titulo, esPlus, precio);
        this.duracion = duracion;
    }

    //Getters and Setters
    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Pelicula{");
        sb.append("  codigo=").append(codigo);
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", esPlus=").append(esPlus);
        sb.append(", precio=").append(precio);
        sb.append(", genero=").append(genero);
        sb.append(", duracion=").append(duracion);
        sb.append('}');
        return sb.toString();
    }
}
