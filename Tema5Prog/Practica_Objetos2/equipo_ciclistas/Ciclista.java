package Tema5Prog.Practica_Objetos2.equipo_ciclistas;

public abstract class Ciclista {

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

    //Getters and Setters

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getTiempoAcumulado() {
        return tiempoAcumulado;
    }

    public void setTiempoAcumulado(double tiempoAcumulado) {
        this.tiempoAcumulado = tiempoAcumulado;
    }

    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Ciclista{");
        sb.append("identificador=").append(identificador);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", tiempoAcumulado=").append(tiempoAcumulado);
        sb.append('}');
        return sb.toString();
    }

   public abstract String imprimirTipo();
}
