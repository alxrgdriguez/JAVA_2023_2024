package Tema5Prog.McBurger.dominio;

public class Agua extends Bebida{

    public Agua(String nombre, tipoIngredientes tipoIngrediente) {
        super(nombre, tipoIngrediente);
        this.nombre = nombre;
        this.tipoIngrediente = tipoIngrediente;
    }

    @Override
    public double obtenerPrecio() {
        return 0;
    }

    public void meterEnNevera() {
    }

    public void sacarDeNevera() {
    }
}
