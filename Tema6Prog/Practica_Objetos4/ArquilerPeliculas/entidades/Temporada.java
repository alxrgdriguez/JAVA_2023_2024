package Tema6Prog.Practica_Objetos4.ArquilerPeliculas.entidades;

import java.util.ArrayList;

public class Temporada {

    //Propiedades
    private int numero;
    private ArrayList<Episodio> episodios;
    private Serie serie;

    //Constructores

    public Temporada(){
        this.numero = 1;
        this.episodios = new ArrayList<>();
        this.serie = new Serie("La venganza de la patata", false, 4.99, Genero.generoPeli.AVENTURAS);
    }

    public Temporada(int numero){
        this.numero = numero;
        this.episodios = new ArrayList<>();
        this.serie = new Serie("", false, 0, null);
    }

    //Getters and Setters

    public int getNumero(){
        return this.numero;
    }

    public ArrayList<Episodio> getEpisodios (){
        return this.episodios;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setEpisodios(ArrayList<Episodio> episodios){
        this.episodios = episodios;
    }

    public void setSerie(Serie serie){
        this.serie = serie;
    }

    //toString
    @Override
    public String toString(){
        final StringBuffer sb = new StringBuffer("Temporada{");
        sb.append("numero=").append(numero);
        sb.append(", serie=").append(serie.getTitulo());
        sb.append(", episodios=").append(this.episodios.size());
        sb.append('}');
        return sb.toString();
    }

    //Metodos

    /**
     * Método para añadir un episodio
     * @param episodio
     */
    public void addEpisodio(Episodio episodio){
        episodio.setTemporada(this);
        this.episodios.add(episodio);
    }

    /**
     * Método para elimninar un episodio
     * @param episodio
     */
    public void deldEpisodio(Episodio episodio){
        this.episodios.remove(episodio);
    }



}
