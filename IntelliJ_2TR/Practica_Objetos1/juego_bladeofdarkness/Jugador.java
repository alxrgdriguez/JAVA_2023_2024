package IntelliJ_2TR.Practica_Objetos1.juego_bladeofdarkness;

public class Jugador {

    //Propiedades

    private String nombre;
    public enum Clase {MAGO,BRUJO,BARBARO,CABALLERO}
    private int nivel;
    private int experiencia;
    private int salud = 200;
    private Arma armaDerecha;
    private Arma armaIzquierda;

    //Constructor
    public Jugador(String nombre, int nivel, int experiencia, int salud, Arma armaDerecha, Arma armaIzquierda) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.experiencia = experiencia;
        this.salud = salud;
        this.armaDerecha = armaDerecha;
        this.armaIzquierda = armaIzquierda;

    }

    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public Arma getArmaDerecha() {
        return armaDerecha;
    }

    public void setArmaDerecha(Arma armaDerecha) {
        this.armaDerecha = armaDerecha;
    }

    public Arma getArmaIzquierda() {
        return armaIzquierda;
    }

    public void setArmaIzquierda(Arma armaIzquierda) {
        this.armaIzquierda = armaIzquierda;
    }


    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Jugador{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", nivel=").append(nivel);
        sb.append(", experiencia=").append(experiencia);
        sb.append(", salud=").append(salud);
        sb.append(", armaDerecha=").append(armaDerecha);
        sb.append(", armaIzquierda=").append(armaIzquierda);
        sb.append('}');
        return sb.toString();
    }
}
