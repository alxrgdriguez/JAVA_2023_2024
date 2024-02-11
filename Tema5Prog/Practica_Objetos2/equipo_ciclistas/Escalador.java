package Tema5Prog.Practica_Objetos2.equipo_ciclistas;

public class Escalador extends Ciclista {

    //Propiedades
    private double potenciaPromedio;
    private double gradoRampaSoportada;

    //Constructor

    public Escalador(int identificador, String nombre, double potenciaPromedio, double gradoRampaSoportada) {
        super(identificador, nombre);
        this.potenciaPromedio = potenciaPromedio;
        this.gradoRampaSoportada = gradoRampaSoportada;
    }

    //Getters and Setters

    public double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    public void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    public double getGradoRampaSoportada() {
        return gradoRampaSoportada;
    }

    public void setGradoRampaSoportada(double gradoRampaSoportada) {
        this.gradoRampaSoportada = gradoRampaSoportada;
    }

    //toString

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Escalador{");
        sb.append("potenciaPromedio=").append(potenciaPromedio);
        sb.append(", gradoRampaSoportada=").append(gradoRampaSoportada);
        sb.append('}');
        return sb.toString();
    }

    /**
     * Método imprimirTipo de ciclista Escalador
     */
    public String imprimirTipo() {
        return "Escalador";
    }
}
