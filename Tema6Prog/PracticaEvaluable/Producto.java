package Tema6Prog.PracticaEvaluable;

public class Producto implements Transportable {

    //Propiedades

    protected String nombre;

    protected double peso;

    //Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.peso = precio;
    }

    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return peso;
    }

    public void setPrecio(double precio) {
        this.peso = precio;
    }

    //toString

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Producto{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", precio=").append(peso);
        sb.append('}');
        return sb.toString();
    }

    //Metodos

    /**
     * Metodo para calcular el coste de envio
     */

    public double calcularCosteEnvio(boolean esInternacional) {

        double costoBase = 20;

        return this.peso * 0.2 + costoBase;

    }
}
