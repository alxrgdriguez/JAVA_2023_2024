package Tema5Prog.Practica_Objetos2.equipo_ciclistas;

public class Velocista extends Ciclista {

    //Propiedades
    private double potenciaPromedio;
    private double velocidadPromedio;

    //Constructor


    public Velocista(int identificador, String nombre) {
        super(identificador, nombre);
        this.potenciaPromedio = potenciaPromedio;
        this.velocidadPromedio = velocidadPromedio;
    }

    //Getters and Setters
    public double getPotenciaPromedio() {
        return potenciaPromedio;
    }

    public void setPotenciaPromedio(double potenciaPromedio) {
        this.potenciaPromedio = potenciaPromedio;
    }

    public double getVelocidadPromedio() {
        return velocidadPromedio;
    }

    public void setVelocidadPromedio(double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }

    //toString

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Velocista{");
        sb.append("potenciaPromedio=").append(potenciaPromedio);
        sb.append(", velocidadPromedio=").append(velocidadPromedio);
        sb.append('}');
        return sb.toString();
    }

    /**
     * Método imprimirTipo de ciclista Velocista
     */
    public String imprimirTipo() {
        return "Velocista";
    }
}
