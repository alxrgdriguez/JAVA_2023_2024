package Tema5Prog.Ejer_Practicar_POO.T5_Ejercicio3;
import java.util.ArrayList;

public class Libreria {

    //Propiedades
    private String nombre;
    private ArrayList<Libro> libro;

    //Constructor

    public Libreria() {
        this.libro = new ArrayList<Libro>();

        for (int i = 0; i < 100; i++) {

            this.libro.add(new Libro(i, "La Celestina " + i, "Fernando de Rojas " + i, "300", true));
        }
    }

    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Metodos

    public void adquiriraLibro(Libro precioCompra) {

        this.libro.add(precioCompra);

    }
}
