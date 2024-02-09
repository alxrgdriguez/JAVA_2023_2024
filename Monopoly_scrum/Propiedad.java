package Monopoly_scrum;

public class Propiedad extends Casilla {

    //Propiedades de Propiedad

    private int coste;

    private int alquiler;

    private String propiedad;

    //Constructor de Propiedad

    public Propiedad(String nombre, int numero, int coste, int alquiler, String propiedad) {
        super(nombre, numero);
        this.propiedad = propiedad;
        this.coste = coste;
        this.alquiler = alquiler;
    }

    public Propiedad(String propiedad, int numero, String nombre, int coste) {
        super(nombre, numero);
    }

    //Getters y Setters de Propiedad

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }

    public int getAlquiler() {
        return alquiler;
    }

    public void setAlquiler(int alquiler) {
        this.alquiler = alquiler;
    }

    public String getPropiedad() {
        return propiedad;
    }

    public void setPropiedad(String propiedad) {
        this.propiedad = propiedad;
    }

    //toString de Propiedad


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Propiedad{");
        sb.append("coste=").append(coste);
        sb.append(", alquiler=").append(alquiler);
        sb.append(", propiedad='").append(propiedad).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", numero=").append(numero);
        sb.append('}');
        return sb.toString();
    }
}
