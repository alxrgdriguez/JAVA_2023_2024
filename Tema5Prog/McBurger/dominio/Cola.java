package Tema5Prog.McBurger.dominio;

public class Cola extends Bebida{

    public Cola(String nombre, tipoIngredientes tipoIngrediente) {
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
