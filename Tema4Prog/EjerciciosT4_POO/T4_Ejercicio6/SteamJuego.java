package Tema4Prog.EjerciciosT4_POO.T4_Ejercicio6;

public class SteamJuego {

    //Propiedades

    private String nombre;
    private String descripcionCorta;
    private double mediaJugadoresDiarios;
    private int diasDesdeSalida;
    private double precio;
    private int puestosMasVendidos;

    //Constructores
    public SteamJuego(String nombre, String descripcionCorta, double mediaJugadoresDiarios, int diasDesdeSalida, double precio, int puestosMasVendidos) {
        this.nombre = nombre;
        this.descripcionCorta = descripcionCorta;
        this.mediaJugadoresDiarios = mediaJugadoresDiarios;
        this.diasDesdeSalida = diasDesdeSalida;
        this.precio = precio;
        this.puestosMasVendidos = puestosMasVendidos;
    }


    //Getters and Setters

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcionCorta() {
        return this.descripcionCorta;
    }

    public void setDescripcionCorta(String descripcionCorta) {
        this.descripcionCorta = descripcionCorta;
    }

    public double getMediaJugadoresDiarios() {
        return this.mediaJugadoresDiarios;
    }

    public void setMediaJugadoresDiarios(double mediaJugadoresDiarios) {
        this.mediaJugadoresDiarios = mediaJugadoresDiarios;
    }

    public int getDiasDesdeSalida() {
        return this.diasDesdeSalida;
    }

    public void setDiasDesdeSalida(int diasDesdeSalida) {
        this.diasDesdeSalida = diasDesdeSalida;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getPuestosMasVendidos() {
        return this.puestosMasVendidos;
    }

    public void setPuestosMasVendidos(int puestosMasVendidos) {
        this.puestosMasVendidos = puestosMasVendidos;
    }

    //Metodos

    public void jugadoresDia(int jugadoresHoy){

        mediaJugadoresDiarios = ((mediaJugadoresDiarios * diasDesdeSalida) + jugadoresHoy) / (diasDesdeSalida + 1);
    }
}
