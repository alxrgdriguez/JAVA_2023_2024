package Tema4Prog.Practica_Objetos1.juego_bladeofdarkness;

public class Arma {

    //Propiedades
    public enum Tipo {ESPADA, HACHA, BASTON, ARCO}
    private String nombre;
    private Tipo tipo;
    private int puntosD;
    private boolean dosManos;

    //Constructor
    public Arma(String nombre, Tipo tipo, int puntosD, boolean dosManos) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.puntosD = puntosD;
        this.dosManos = dosManos;
    }

    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public int getPuntosD() {
        return puntosD;
    }

    public void setPuntosD(int puntosD) {
        this.puntosD = puntosD;
    }

    public boolean isDosManos() {
        return dosManos;
    }

    public void setDosManos(boolean dosManos) {
        this.dosManos = dosManos;
    }

    //toString

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Arma{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", tipo=").append(tipo);
        sb.append(", puntosD=").append(puntosD);
        sb.append(", dosManos=").append(dosManos);
        sb.append('}');
        return sb.toString();
    }
}
