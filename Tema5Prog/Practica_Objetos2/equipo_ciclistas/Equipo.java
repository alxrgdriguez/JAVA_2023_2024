package Tema5Prog.Practica_Objetos2.equipo_ciclistas;

import java.util.Objects;

public class Equipo {

    //Propiedades

    private String nombre;

    public static double tiemposCarrera;

    private String pais;

    //Constructor

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        tiemposCarrera = 0;
    }

    //Getters and Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static double getTiemposCarrera() {
        return tiemposCarrera;
    }

    public static void setTiemposCarrera(double tiemposCarrera) {
        Equipo.tiemposCarrera = tiemposCarrera;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    //toString

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Equipo{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", pais='").append(pais).append('\'');
        sb.append('}');
        return sb.toString();
    }

    //equals

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Equipo equipo = (Equipo) o;
        return Objects.equals(nombre, equipo.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
