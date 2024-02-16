package Tema5Prog.McBurger.dominio;

import java.time.LocalDate;
import java.time.Period;

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
        final StringBuffer sb = new StringBuffer("Hamburguesa................. ");
        sb.append(obtenerPrecio()).append("€");
        return sb.toString();
    }

    //Metodos

    /**
     * El precio de una hamburguesa es de 3,50 €.
     * Si falta 1 día para que caduque, se le hará un descuento del 50 %.
     * Si faltan 2 días para que caduque, se le hará un descuento del 40 %.
     * Si faltan 3 días para que caduque, se le hará un descuento del 30 %.
     * Si faltan 4 días para que caduque, se le hará un descuento del 20 %.
     * @return Devuelve el precio de la hamburguesa dependiendo de la fecha antes de que caduque con un % de descuento distinto
     */
    @Override
    public double obtenerPrecio() {
        double precioHamburguersa = 3.50;
        LocalDate hoy = LocalDate.now();
        Period periodo = Period.between(hoy,fechaCaducidad);

        if (periodo.getDays() == 1) {
           precioHamburguersa = precioHamburguersa * 0.50;
        } else if (periodo.getDays() == 2) {
           precioHamburguersa = precioHamburguersa * 0.40;

        } else if (periodo.getDays() == 3) {
            precioHamburguersa = precioHamburguersa * 0.30;

        } else if (periodo.getDays() == 4) {
          precioHamburguersa = precioHamburguersa * 0.20;

        }


        return precioHamburguersa;


    }

    /**
     * Metodo para cocinar una hamburguesa
     */
    public void cocinar() {
        this.Cocinado = true;
    }
}
