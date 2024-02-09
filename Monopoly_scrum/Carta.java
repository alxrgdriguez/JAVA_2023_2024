package Monopoly_scrum;

public class Carta {

    //Propiedades de Carta
    private String texto;

    private Tablero moverte;

    private int cantidad;

    //Constructor de Carta

    public Carta(String texto, Tablero moverte, int cantidad) {
        this.texto = texto;
        this.moverte = moverte;
        this.cantidad = cantidad;
    }

    //Getters y Setters de Carta

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Tablero getMoverte() {
        return moverte;
    }

    public void setMoverte(Tablero moverte) {
        this.moverte = moverte;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    //toString de Carta

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Carta{");
        sb.append("texto='").append(texto).append('\'');
        sb.append(", moverte=").append(moverte);
        sb.append(", cantidad=").append(cantidad);
        sb.append('}');
        return sb.toString();
    }
}
