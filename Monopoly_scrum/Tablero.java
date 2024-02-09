package Monopoly_scrum;

import java.util.ArrayList;

public class Tablero {

    //Propiedades Tablero
    private ArrayList<Casilla> casillas;

    //Cosntructores Tablero

    /**
     * Constructor de Tablero para declarar el arraylist de casillas
     */
    public Tablero() {
        this.casillas = new ArrayList<>(40);
    }

    /**
     * Cosntructor para generar 40 casillas al tablero
     * 1. Inicio
     * 20.Carcel
     * 5. Casillas de impuestos
     * 28.Propiedad
     * 5. Casillas de carta
     */





    //Getters Tablero

    public ArrayList<Casilla> getCasilla() {
        return casillas;
    }

    //toString Tablero

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tablero{");
        sb.append("casillas=").append(casillas);
        sb.append('}');
        return sb.toString();
    }

    //Metodos de Tablero

    /**
     * Metodo para agregar una casilla a la lista de casillas
     */
    public void agregarCasilla(Casilla casilla) {
        casillas.add(casilla);
    }
}
