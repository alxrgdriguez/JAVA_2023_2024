package Tema5Prog.McBurger.dominio;

import java.time.LocalDate;

public class Hamburguesa extends Comida {

    //Propiedades

    private LocalDate fechaCaducidad;


    //Constructor

    public Hamburguesa(String fechaCaducidad) {
        super("Hamburguesa", tipoIngredientes.comida);
        this.fechaCaducidad = LocalDate.parse(fechaCaducidad);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Hamburguesa.................");
        sb.append(obtenerPrecio());
        return sb.toString();
    }

    //Metodos

    @Override
    public double obtenerPrecio() {
        return 0;
    }

    public void cocinar() {
    }
}
