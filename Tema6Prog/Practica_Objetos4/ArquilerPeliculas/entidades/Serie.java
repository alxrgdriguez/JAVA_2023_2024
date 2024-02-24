package Tema6Prog.Practica_Objetos4.ArquilerPeliculas.entidades;

import Tema6Prog.Practica_Objetos4.ArquilerPeliculas.servicios.Multimedia;

import java.util.ArrayList;

public class Serie extends Multimedia {

    //Propiedades
    private ArrayList<Temporada> temporadas;

    //Constructor
    public Serie(String titulo, boolean esPlus, double precio, Genero.generoPeli genero) {
        super(titulo, esPlus, precio);
        setGenero(genero);
        this.temporadas = new ArrayList<>();
    }

    //Getters and Setters
    public ArrayList<Temporada> getTemporadas(){

        return this.temporadas;
    }

    public void setTemporadas(ArrayList<Temporada> temporadas){
        this.temporadas = temporadas;
    }

    //toString
    @Override
    public String toString(){
       final StringBuffer sb = new StringBuffer("Serie{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(", esPlus=").append(esPlus);
        sb.append(", precio=").append(precio);
        sb.append(", genero=").append(genero);
        sb.append('}');

        return sb.toString();
    }


    //Metodos

    /**
     * Devuelve el total de temporadas
     * @return
     */
    public int getNumeroTemporadas(){

        return this.temporadas.size();
    }

    /**
     * Metodo para añadir una temporada
     * @param temporada
     */
    public void addTemporada(Temporada temporada){
        temporada.setSerie(this);
        this.temporadas.add(temporada);
    }

    /**
     * Metodo para elimnar una temporada
     * @param temporada
     */
    public void delTemporada(Temporada temporada){
        this.temporadas.remove(temporada);
    }

}
