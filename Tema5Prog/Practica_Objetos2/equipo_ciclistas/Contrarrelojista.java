package Tema5Prog.Practica_Objetos2.equipo_ciclistas;

public class Contrarrelojista extends Ciclista {

    //Propiedades

    private double velocidadMaxima;

    //Constructor

    public Contrarrelojista(int identificador, String nombre) {
        super(identificador, nombre);
        this.velocidadMaxima = velocidadMaxima;
    }

    //Getters and Setters

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    //toString

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Contrarrelojista{");
        sb.append("velocidadMaxima=").append(velocidadMaxima);
        sb.append('}');
        return sb.toString();
    }

    /**
     * Método imprimirTipo de ciclista Contrarrelojista
     */
    public String imprimirTipo() {
        return "Contrarrelojista";
    }
}
