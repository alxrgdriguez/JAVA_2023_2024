package Tema5Prog.Practica_Objetos2.equipo_ciclistas;

import java.util.ArrayList;
import java.util.Objects;

public class Equipo {

    //Propiedades

    private String nombre;
    public static double tiemposCarrera;
    private String pais;
    private ArrayList<Ciclista> ciclistas;

    //Constructor

    public Equipo(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        tiemposCarrera = 0;
        this.ciclistas = new ArrayList<>();
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

    public ArrayList<Ciclista> getCiclistas() {
        return ciclistas;
    }

    public void setCiclistas(ArrayList<Ciclista> ciclistas) {
        this.ciclistas = ciclistas;
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

    /**
     * Metodo para calcular el tiempo de carrera del equipo
     */

    public double calcularTiempoCarrera() {
        for (int i = 0; i < ciclistas.size(); i++) {
            tiemposCarrera += ciclistas.get(i).getTiempoAcumulado();
        }
        return tiemposCarrera;
    }

    /**
     * Metodo para añadir un ciclista al equipo
     */

    public void addCiclista(Ciclista ciclista) {

        //Utilizamos el array
        this.ciclistas.add(ciclista);
    }

    /**
     * Método para buscar un ciclista en el equipo mediante el identificador
     */

    public String buscarCiclista(int identificador) {

        for (int i = 0; i < this.ciclistas.size(); i++) {
            if (this.ciclistas.get(i).getIdentificador() == identificador) {
                return this.ciclistas.get(i).toString();
            }
        }
        return null;
    }


}
