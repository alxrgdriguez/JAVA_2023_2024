package Monopoly_scrum;

import java.util.Objects;

public abstract class Casilla {

    //Propiedades de Casilla

    protected String nombre;

    protected int numero;

    //Constructor de Casilla

    public Casilla(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    //Getters y Setters de Casilla

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    //toString de Casilla

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Casilla{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", numero=").append(numero);
        sb.append('}');
        return sb.toString();
    }

    //equals de Casilla

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Casilla casilla = (Casilla) o;
        return numero == casilla.numero && Objects.equals(nombre, casilla.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, numero);
    }
}
