package Tema5Prog.McBurger.dominio;

import java.time.LocalDate;

public class Hamburguesa extends Comida {

    //Propiedades

    private LocalDate fechaCaducidad;

    //Constructor

    public Hamburguesa(String nombre, tipoIngredientes tipoIngrediente) {
        super(nombre, tipoIngrediente);
        this.fechaCaducidad = LocalDate.now();
    }


    //Metodos

    @Override
    public double obtenerPrecio() {
        return 0;
    }

    public void cocinar() {
    }
}
