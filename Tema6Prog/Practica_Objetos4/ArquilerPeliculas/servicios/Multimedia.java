package Tema6Prog.Practica_Objetos4.ArquilerPeliculas.servicios;

import Tema6Prog.Practica_Objetos4.ArquilerPeliculas.entidades.Genero;

import java.util.Objects;

public class Multimedia {

    //Propiedades

    protected static long autoincremento = 1;

    protected long codigo;

    protected String titulo;

    protected boolean esPlus;

    protected double precio;

    protected Genero.generoPeli genero;

    //Constructor

    /**
     * Constructor por defecto
     */
    public Multimedia() {

        this.codigo = autoincremento++;
        this.titulo = "Spider-Man";
        this.esPlus = false;
        this.precio = 4.50;
        this.genero = Genero.generoPeli.ACCION;

    }

    /**
     * Constructor parametrizado solo llevando (título, plus y precio)
     * @param titulo
     * @param esPlus
     * @param precio
     */

    public Multimedia(String titulo, boolean esPlus, double precio) {
        this.titulo = titulo;
        this.esPlus = esPlus;
        this.precio = precio;

    }

    //Getters and Setters

    public long getAutoincremento(){
        return autoincremento;
    }

    public void setAutoincremento(long autoincremento){
        this.autoincremento = autoincremento;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isEsPlus() {
        return esPlus;
    }

    public void setEsPlus(boolean esPlus) {
        this.esPlus = esPlus;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Genero.generoPeli getGenero() {
        return genero;
    }

    public void setGenero(Genero.generoPeli genero) {
        this.genero = genero;
    }

    //toString

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Multimedia{");
        sb.append("codigo=").append(codigo);
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", esPlus=").append(esPlus);
        sb.append(", precio=").append(precio);
        sb.append(", genero=").append(genero);
        sb.append('}');
        return sb.toString();
    }

    //equals

    @Override
    public boolean equals(Object o) {
        /*if (this == o){ return true;
        if (o == null) return false;
        Multimedia that = (Multimedia) o;
        return codigo == that.codigo;*/
        Multimedia that = (Multimedia) o;
        if(this.getTitulo() == that.getTitulo()){
            return true;
        }else {
            return false;
        }

    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
